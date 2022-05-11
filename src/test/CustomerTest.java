package test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.Customer;
import main.Movie;
import main.Rental;

public class CustomerTest {

	private Customer customer;

	@Before
	public void setup() {
		customer = new Customer("Max");
		customer.addRental(new Rental(new Movie("Back to the Future", 0), 5));
	}

	@Test
	public void testGetName() {
		assertEquals(customer.getName(), "Max");

	}

	@Test
	public void testStatement() {
		System.out.println(customer.statement());
		assertEquals(customer.statement(),
				"Rental Record for Max\n" + "	Title		Days	Amount\n" + "	Back to the Future		5	6.5\n"
						+ "Amount owed is 6.5\n" + "You earned 1 frequent renter points");

	}

}
