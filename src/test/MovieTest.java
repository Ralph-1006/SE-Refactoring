package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Movie;

public class MovieTest {

	private Movie movie;

	@Before
	public void setup() {
		movie = new Movie("Back to the Future", 0);
	}

	@Test
	public void testGetTitle() {
		assertEquals(movie.getTitle(), "Back to the Future");
	}

	@Test
	public void testGetPriceCode() {
		assertEquals(movie.getPriceCode(), 0);
	}

	@Test
	public void testSetPriceCode() {
		Movie m = new Movie("Star Wars: a new hope", 1);
		m.setPriceCode(0);
		assertEquals(m.getPriceCode(), 0);
	}

}
