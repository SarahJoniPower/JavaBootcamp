package bootcamp.directory;

import bootcamp.data.Address;
import bootcamp.data.Person;
import bootcamp.data.PersonAddressPair;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class AddressDirectoryTest {

    List<PersonAddressPair> list;
    AddressDirectory directory;

    @Before
    public void init() {
        list = new ArrayList<>();
        PersonAddressPair meganEntry = new PersonAddressPair(new Person("Megan", "G"), new Address("Other side of flat", "Our place", "WOOO", "LONDON"));
        PersonAddressPair rebsEntry = new PersonAddressPair(new Person("Rebs", "Nells"), new Address("Next room", "Our flat", "ZZZEEE", "LONDON"));
        list.add(meganEntry);
        list.add(rebsEntry);
        directory = new AddressDirectory(list);
    }

    @Test
    public void getAddressExistingInDirectory() {
        Address address = new Address("Other side of flat", "Our place", "WOOO", "LONDON");
        assertEquals(directory.getAddress(new Person("Megan", "G")).get(), address);
    }

    @Test
    public void returnEmptyWhenNoAddress() {
        Optional<Address> address = directory.getAddress(new Person("Sarah", "G"));
        assertEquals(true, address.isEmpty());
    }

    @Test
    public void updateAddressWhenPersonExistsInDirectory() {
        Person existingPerson = new Person("Megan", "G");
        Address newAddress = new Address("new", "new", "new", "new");
        directory.updateAddress(new PersonAddressPair(existingPerson, newAddress));
        assertEquals(directory.getAddress(existingPerson).get(), newAddress);
    }

    @Test
    public void updateAddressWhenPersonDoesNotExistInDirectory() {
        Person nonexistingPerson = new Person("Sarah", "G");
        Address newAddress = new Address("new2", "new2", "new2", "new2");
        directory.updateAddress(new PersonAddressPair(nonexistingPerson, newAddress));
        assertEquals(directory.getAddress(nonexistingPerson).get(), newAddress);
    }
}


