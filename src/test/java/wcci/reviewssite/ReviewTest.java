package wcci.reviewssite;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReviewTest {

Category hodor = new Category();
	
	@Test
	public void reviewShouldHaveAllValues() {
		Review reviewTest = new Review("title", "url", hodor, "con");
		String expectedReviewContent = reviewTest.getContent();
		long expectedID = reviewTest.getId();
		String expectedTitle = reviewTest.getTitle();
		String expectedImageUrl = reviewTest.getImageUrl();
		Category expectedReviewCategory = reviewTest.getCategory();
		assertEquals("con", expectedReviewContent);
		assertEquals(hodor, expectedReviewCategory);
		assertEquals("url", expectedImageUrl);	
		assertEquals("title", expectedTitle);
		assertEquals(0L, expectedID);

	}

	@Test
	public void reviewShouldHaveDifferentValues() {
		Review reviewTest = new Review("title2", "url2", hodor, "con2");
		String expectedReviewContent = reviewTest.getContent();
		long expectedID = reviewTest.getId();
		String expectedTitle = reviewTest.getTitle();
		String expectedImageUrl = reviewTest.getImageUrl();
		Category expectedReviewCategory = reviewTest.getCategory();
		assertEquals("con2", expectedReviewContent);
		assertEquals(hodor, expectedReviewCategory);
		assertEquals("url2", expectedImageUrl);
		assertEquals("title2", expectedTitle);
		assertEquals(2L, expectedID);

	}

}
