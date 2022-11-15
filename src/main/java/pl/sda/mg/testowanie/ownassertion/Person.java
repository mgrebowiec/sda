package pl.sda.mg.testowanie.ownassertion;

public class Person {
    private final String name;
    private final int age;
    private final String pesel;

    public Person(String name, int age, String pesel) {
        this.name = name;
        this.age = age;
        this.pesel = pesel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPesel() {
        return pesel;
    }
}
