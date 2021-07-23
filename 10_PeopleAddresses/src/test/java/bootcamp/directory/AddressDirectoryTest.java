package bootcamp.directory;

import bootcamp.data.Address;
import bootcamp.data.Person;
import bootcamp.data.PersonAddressPair;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
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
}
