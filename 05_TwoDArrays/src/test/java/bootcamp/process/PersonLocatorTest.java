package bootcamp.process;

import bootcamp.data.Location;
import bootcamp.data.Person;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Optional;

public class PersonLocatorTest {
    @Test
    public void shouldGetLocationWithCorrectValuesWhenProcessingValidPerson() {
        Person[][] people = {
                {new Person("Sarah", "Power"), new Person("Megan", "Glancy"), new Person("Olive", "Pascha")},
                {new Person("Rebs", "Nellis"), new Person("Mark", "Starling")},
                {new Person("Megan", "Brownrigg"), new Person("Matthew", "Durkan")}
        };

        PersonLocator personLocator = new PersonLocator(people);

        Optional<Location> locationExpected = Optional.of(new Location(0,0));
        Optional<Location> locationResult = personLocator.find(new Person("Sarah", "Power"));
        assertEquals(locationExpected, locationResult);
    }

}
