package bootcamp.data;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private final String firstName;
    private final String secondName;

    public Person(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    @Override
    public int compareTo(Person person) {
        return getFirstName().compareToIgnoreCase(person.getFirstName());
    }
}
