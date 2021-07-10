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
        for (int x = 0; x <= people.length - 1; x++) {
            for (int y = 0; y <= people[x].length - 1; y++) {
                    if (personToFind.equals(people[x][y])) {
                        return Optional.of(new Location(x, y));
                    }
            }
            }
        return Optional.empty();
    }
}
