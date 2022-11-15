package pl.sda.mg.testowanie.ownassertion;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.time.*;

import static org.junit.jupiter.api.Assertions.*;
import static pl.sda.mg.testowanie.ownassertion.PersonAssert.assertThatPerson;

class PersonFactoryTest {
    private static PersonFactory personFactory;

    @BeforeAll
    static void initialize() {
        LocalDate date = LocalDate.of(2022, 11, 16);
        // Get default timezone
        ZoneId zoneId = ZoneId.systemDefault();
        Instant instant = date.atStartOfDay(zoneId).toInstant();

        personFactory = new PersonFactory(Clock.fixed(instant, zoneId));
    }

    @Test
    void shouldCreateValidPerson() {
        //given
        String name = "Michal";
        String pesel = "84082011111";

        //when
        final Person actualPerson = personFactory.buildPerson(name, pesel);

        //then
        assertThatPerson(actualPerson)
                .isValid()
                .hasAge(38)
                .hasName("Michal");
    }

    @Test
    void shouldNotCreatePersonWhenNameIsNull() {
        //given
        String name = null;
        String pesel = "84082011111";

        //when
        final Person actualPerson = personFactory.buildPerson(name, pesel);

        //then
        assertThatPerson(actualPerson)
                .notExist();
    }

    @Test
    void shouldNotCreatePersonWhenPeselIsNull() {
        //given
        String name = "Michal";
        String pesel = null;

        //when
        final Person actualPerson = personFactory.buildPerson(name, pesel);

        //then
        assertThatPerson(actualPerson)
                .notExist();
    }

    @Test
    void shouldNotCreatePersonWhenPeselIsNotValid() {
        //given
        String name = "Michal";
        String pesel = "000000";

        //when
        final Person actualPerson = personFactory.buildPerson(name, pesel);

        //then
        assertThatPerson(actualPerson)
                .notExist();
    }

}