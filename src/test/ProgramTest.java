package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.Customer;
import main.Movie;
import main.Rental;

public class ProgramTest {

	@Test
	public void test() {

		String exp = "Rental Record for joe\n" + "\tTitle\t\tDays\tAmount\n" + "	movie1		10	30.0\n"
				+ "	movie2		5	4.5\n" + "Amount owed is 34.5\n" + "You earned 3 frequent renter points";

		String result;
		Movie m1 = new Movie("movie1", 1);
		Movie m2 = new Movie("movie2", 2);
		Rental r1 = new Rental(m1, 10);
		Rental r2 = new Rental(m2, 5);
		Customer c1 = new Customer("joe");
		c1.addRental(r1);
		c1.addRental(r2);
		result = c1.statement();
		assertEquals(exp, result);
	}

}
