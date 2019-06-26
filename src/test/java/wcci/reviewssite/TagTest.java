package wcci.reviewssite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TagTest {

	
	@Test
	public void tagShouldHaveName() {
		Tag underTest = new Tag("cars");
		String expectedTagName = underTest.getName();
		
		assertEquals("cars", expectedTagName);
		
	}
	
}
