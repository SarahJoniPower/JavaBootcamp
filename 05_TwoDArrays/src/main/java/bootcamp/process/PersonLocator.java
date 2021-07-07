package bootcamp.process;

import bootcamp.data.Location;
import bootcamp.data.Person;

import java.util.Optional;

public class PersonLocator {
    private final Person[][] people;

    public PersonLocator(Person[][] people) {
        this.people = people.clone();
    }

    public Optional<Location> find(final Person personToFind) {
        Optional<Location> location = Optional.empty();
        for (int x = 0; x <= people.length - 1; x++) {
            for (int y = 0; y <= people[x].length - 1; y++) {
                if (personToFind.hashCode() == people[x][y].hashCode()) {
                    if (personToFind.equals(people[x][y])) {
                        location = Optional.of(new Location(x, y));
                        break;
                    }
                } else continue;
            }
            }
        return location;
    }
}
