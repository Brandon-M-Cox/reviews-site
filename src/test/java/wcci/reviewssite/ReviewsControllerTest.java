package wcci.reviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

public class ReviewsControllerTest {
	

	@Test
	public void shouldReturnOneReview() {
		ReviewsController underTest = new ReviewsController();
		String displayedReview = underTest.getReview(1L, Model);
		assertThat(displayedReview, is(1L));
		
	}

}
