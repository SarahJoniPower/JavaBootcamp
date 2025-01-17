import org.junit.Test;

import static org.junit.Assert.*;

public class CinemaTest {
    @Test
    public void shouldBeAbleToBuyCinemaTicketWhenOlderThanRestriction() {
        //given
        int age = 19;
        Customer customer = new Customer(age);
        Movie movie = new Movie("Frozen 2", 12);
        Cinema cinema = new Cinema();
        //when
        boolean canGetTicket = cinema.canBuyTicket(movie, customer);
        //then
        assertTrue(canGetTicket);
    }

    @Test
    public void shouldNotBeAbleToBuyCinemaTicketWhenYoungerThanRestriction() {
        //given
        int age = 9;
        Customer customer = new Customer(age);
        Movie movie = new Movie("Frozen 2", 12);
        Cinema cinema = new Cinema();
        //when
        boolean canGetTicket = cinema.canBuyTicket(movie, customer);
        //then
        assertFalse(canGetTicket);
    }

    @Test(expected = Exception.class)
    public void shouldThrowExceptionWhenTryOrderTicketAndYoungerThanAgeRestriction() throws Exception {
        //given
        int age = 9;
        Customer customer = new Customer(age);
        Movie movie = new Movie("Frozen 2", 12);
        Cinema cinema = new Cinema();
        //when
        cinema.orderTicket(movie, customer, 42);
    }

    @Test
    public void shouldGetTicketForTheRightSeatAndMovie() throws Exception {
        //given
        int age = 19;
        String title = "Frozen 2";
        int seat = 42;
        Customer customer = new Customer(age);
        Movie movie = new Movie(title, 12);
        Cinema cinema = new Cinema();
        //when
        Ticket ticket = cinema.orderTicket(movie, customer, seat);
        //then
        assertEquals(movie.getTitle(), ticket.getTitle());
        assertEquals(seat, ticket.getSeat());
    }
}
