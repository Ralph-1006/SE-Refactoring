package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Movie;
import main.Rental;

public class RentalTest {

	private Rental rental;
	private Movie movie;

	@Before
	public void setup() {
		movie = new Movie("Back to the Future", 0);
		rental = new Rental(movie, 3);
	}

	@Test
	public void testGetDays() {
		assertEquals(rental.getDaysRented(), 3);
	}

	@Test
	public void testGetTitle() {
		assertEquals(rental.getMovie(), movie);
	}

}
