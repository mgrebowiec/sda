package pl.sda.mg.testowanie.ownassertion;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class PersonAssert {
    private final Person person;

    private PersonAssert(Person person) {
        this.person = person;
    }

    public static PersonAssert assertThatPerson(Person person) {
        return new PersonAssert(person);
    }

    public PersonAssert isValid() {
        assertNotNull(person);
        assertNotNull(person.getName());
        assertNotNull(person.getPesel());
        assertTrue(person.getAge() > 0, "Wiek musi byc wiekszy od 0");
        return this;
    }

    public PersonAssert hasAge(int age) {
        assertEquals(age, person.getAge());
        return this;
    }

    public PersonAssert hasName(String name) {
        assertEquals(name, person.getName());
        return this;
    }

    public PersonAssert notExist() {
        assertNull(person);
        return this;
    }
}
