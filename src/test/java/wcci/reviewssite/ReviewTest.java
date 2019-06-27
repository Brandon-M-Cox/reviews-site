package wcci.reviewssite;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReviewTest {

Category cat = new Category();
	
	@Test
	public void reviewShouldHaveAllValues() {
		Review reviewTest = new Review("title", "url", cat, "con");
		String expectedReviewContent = reviewTest.getContent();
		Long expectedID = reviewTest.getId();
		String expectedTitle = reviewTest.getTitle();
		String expectedImageUrl = reviewTest.getImageUrl();
		Category expectedReviewCategory = reviewTest.getCategory();
		assertThat(expectedID, is(reviewTest.getId()));
		assertEquals("con", expectedReviewContent);
		assertEquals(cat, expectedReviewCategory);
		assertEquals("url", expectedImageUrl);	
		assertEquals("title", expectedTitle);

	}	


}
