package wcci.reviewssite.integrationtests;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import wcci.reviewssite.Category;
import wcci.reviewssite.CategoryRepository;
import wcci.reviewssite.Review;
import wcci.reviewssite.ReviewRepository;
import wcci.reviewssite.ReviewsController;

@WebMvcTest(ReviewsController.class)

@RunWith(SpringRunner.class)

public class MvcReviewWebLayerTest {
	
	@Autowired
	MockMvc mockMvc;
	@MockBean
	ReviewRepository reviewRepository;
	@MockBean
	CategoryRepository categoryRepository;
	@Mock
	Review mockReview;
	@Mock
	private Category mockCategory;
	
	@Test
	public void shouldReturnReview() throws Exception{
		Optional<Review> mockReviewOptional = Optional.of(mockReview);
		when(reviewRepository.findById(1L)).thenReturn(mockReviewOptional);
		when(mockReview.getCategory()).thenReturn(mockCategory);
		this.mockMvc.perform(get("/reviews/1")).andDo(print()).andExpect(status().isOk());
	}
		
}
