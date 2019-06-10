package wcci.reviewssite;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReviewTest {
	
	@Test
	public void reviewShouldHaveIDOf1() {
		Review reviewTest = new Review(1);
		int expectedID = reviewTest.getID();
		  assertEquals(1, expectedID);
		
	}
	
	@Test
	public void reviewShouldHaveIDOf2() {
		Review reviewTest = new Review(2);
		int expectedID = reviewTest.getID();
		  assertEquals(2, expectedID);
	}

}
