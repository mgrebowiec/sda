package pl.sda.mg.testowanie.ownassertion;

import pl.sda.mg.testowanie.pesel.PeselUtil;

import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;

public class PersonFactory {
    private Clock clock;

    public PersonFactory(Clock clock) {
        this.clock = clock;
    }

    public Person buildPerson(String name, String pesel) {
        if (name == null || pesel == null) {
            return null;
        }

        LocalDate birthDate = PeselUtil.getBirthDate(pesel);
        if (birthDate == null) {
            return null;
        }

        int age = Math.abs(Period.between(LocalDate.now(clock), birthDate).getYears());
        return new Person(name, age, pesel);
    }
}
