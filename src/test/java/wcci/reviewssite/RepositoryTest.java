package wcci.reviewssite;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RepositoryTest {
	
	@Test
	public void repositoryContainsMultipleReviews() {
		Repository underTest = new Repository();
		int numberOfReviews = underTest.getReviews();
		underTest.addReview(1);
		assertEquals(numberOfReviews, 2);
		
		
	}

}
