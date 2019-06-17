package wcci.reviewssite;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReviewTest {


	@Test
	public void reviewShouldHaveAllValues() {
		Review reviewTest = new Review(0, "title", "url", "cat", "con");
		String expectedReviewContent = reviewTest.getContent();
		long expectedID = reviewTest.getId();
		String expectedTitle = reviewTest.getTitle();
		String expectedImageUrl = reviewTest.getImageUrl();
		String expectedReviewCategory = reviewTest.getCategory();
		assertEquals("con", expectedReviewContent);
		assertEquals("cat", expectedReviewCategory);
		assertEquals("url", expectedImageUrl);
		assertEquals("title", expectedTitle);
		assertEquals(0L, expectedID);

	}

	@Test
	public void reviewShouldHaveDifferentValues() {
		Review reviewTest = new Review(2, "title2", "url2", "cat2", "con2");
		String expectedReviewContent = reviewTest.getContent();
		long expectedID = reviewTest.getId();
		String expectedTitle = reviewTest.getTitle();
		String expectedImageUrl = reviewTest.getImageUrl();
		String expectedReviewCategory = reviewTest.getCategory();
		assertEquals("con2", expectedReviewContent);
		assertEquals("cat2", expectedReviewCategory);
		assertEquals("url2", expectedImageUrl);
		assertEquals("title2", expectedTitle);
		assertEquals(2L, expectedID);

	}

}
