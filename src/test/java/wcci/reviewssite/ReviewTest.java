package wcci.reviewssite;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReviewTest {
	
	@Test
	public void reviewShouldHaveIDOf1() {
		Review reviewTest = new Review(1, "title", "","","");
		long expectedID = reviewTest.getID();
		  assertEquals(1, expectedID);
		
	}
	
	@Test
	public void reviewShouldHaveIDOf2() {
		Review reviewTest = new Review(2, "title", "","","");
		long expectedID = reviewTest.getID();
		  assertEquals(2, expectedID);
	}
	
	@Test
	public void reviewShouldHaveTitleOfTitle() {
		Review reviewTest = new Review(0, "title", "","","");
		String expectedTitle = reviewTest.getTitle();
		  assertEquals("title", expectedTitle);
	}

	@Test
	public void reviewShouldHaveUrlOfUrl() {
		Review reviewTest = new Review(0, "title", "url","","");
		String expectedImageUrl = reviewTest.getImageUrl();
		  assertEquals("url", expectedImageUrl);
	}
	
	@Test
	public void reviewShouldHaveCategoryOfCat() {
		Review reviewTest = new Review(0, "title", "url","cat","");
		String expectedReviewCategory = reviewTest.getReviewCategory();
		  assertEquals("cat", expectedReviewCategory);
	}
	
	@Test
	public void reviewShouldHaveContentOfCon() {
		Review reviewTest = new Review(0, "title", "url","cat","con");
		String expectedReviewContent = reviewTest.getReviewContent();
		  assertEquals("con", expectedReviewContent);
	}

}
