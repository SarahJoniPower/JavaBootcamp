package bootcamp.data;

import java.util.Objects;

public class PersonAddressPair {
    private final Person person;
    private final Address address;

    public PersonAddressPair(final Person person, final Address address) {
        this.person = person;
        this.address = address;
    }

    public Person getPerson() {
        return this.person;
    }

    public Address getAddress() {
        return this.address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonAddressPair that = (PersonAddressPair) o;
        return Objects.equals(person, that.person) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, address);
    }
}
