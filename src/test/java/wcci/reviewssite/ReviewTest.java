package wcci.reviewssite;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class ReviewTest {
	
//	@Test
//	public void reviewShouldHaveIDOf1() {
//		Review reviewTest = new Review(1, "title", "","","");
//		long expectedID = reviewTest.getID();
//		  assertEquals(1L, expectedID);
//		
//	}
//	
//	@Test
//	public void reviewShouldHaveIDOf2() {
//		Review reviewTest = new Review(2, "title", "","","");
//		long expectedID = reviewTest.getID();
//		  assertEquals(2L, expectedID);
//	}
//	
//	@Test
//	public void reviewShouldHaveTitleOfTitle() {
//		Review reviewTest = new Review(0, "title", "","","");
//		String expectedTitle = reviewTest.getTitle();
//		  assertEquals("title", expectedTitle);
//	}
//
//	@Test
//	public void reviewShouldHaveUrlOfUrl() {
//		Review reviewTest = new Review(0, "title", "url","","");
//		String expectedImageUrl = reviewTest.getImageUrl();
//		  assertEquals("url", expectedImageUrl);
//	}
//	
//	@Test
//	public void reviewShouldHaveCategoryOfCat() {
//		Review reviewTest = new Review(0, "title", "url","cat","");
//		String expectedReviewCategory = reviewTest.getReviewCategory();
//		  assertEquals("cat", expectedReviewCategory);
//	}
	
	@Test
	public void reviewShouldHaveAllValues() {
		Review reviewTest = new Review(0, "title", "url","cat","con");
		String expectedReviewContent = reviewTest.getReviewContent();
		long expectedID = reviewTest.getID();
		String expectedTitle = reviewTest.getTitle();
		String expectedImageUrl = reviewTest.getImageUrl();
		String expectedReviewCategory = reviewTest.getReviewCategory();
		  assertEquals("con", expectedReviewContent);
		  assertEquals("cat", expectedReviewCategory);
		  assertEquals("url", expectedImageUrl);
		  assertEquals("title", expectedTitle);
		  assertEquals(0L, expectedID);
		  
	}
	@Test
	public void reviewShouldHaveDifferentValues() {
		Review reviewTest = new Review(2, "title2", "url2","cat2","con2");
		String expectedReviewContent = reviewTest.getReviewContent();
		long expectedID = reviewTest.getID();
		String expectedTitle = reviewTest.getTitle();
		String expectedImageUrl = reviewTest.getImageUrl();
		String expectedReviewCategory = reviewTest.getReviewCategory();
		  assertEquals("con2", expectedReviewContent);
		  assertEquals("cat2", expectedReviewCategory);
		  assertEquals("url2", expectedImageUrl);
		  assertEquals("title2", expectedTitle);
		  assertEquals(2L, expectedID);
		  
	}

}
