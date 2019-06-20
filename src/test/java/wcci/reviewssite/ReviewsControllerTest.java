package wcci.reviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import wcci.reviewssite.Review;
import wcci.reviewssite.ReviewsController;
import wcci.reviewssite.ReviewRepository;

public class ReviewsControllerTest {
	@InjectMocks
	ReviewsController underTest;
	
	@Mock
	ReviewRepository mockRepo;
	@Mock
	Model mockModel;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}
	Category hodor = new Category();

	@Test
	public void shouldReturnOneReview() {
		Review testReview = new Review(1,"Title1","imageUrl1", hodor, "content");
		List<Review > testReviews= Collections.singletonList(testReview);
		Mockito.when(mockRepo.findAll()).thenReturn(testReviews);
		underTest.getReviews(mockModel);
		Mockito.verify(mockModel).addAttribute("reviews", testReviews);
		
	}

	@Test
	public void shouldReturnAllReviews() {
		Review testReview1 = new Review(1,"Title1","imageUrl1", hodor, "content1");
		Review testReview2 = new Review(2,"Title1","imageUrl1", hodor, "content2");
		Review testReview3 = new Review(3,"Title1","imageUrl1", hodor, "content3");
		List<Review > testReviews= Arrays.asList(testReview1,testReview2,testReview3);
		Mockito.when(mockRepo.findAll()).thenReturn(testReviews);
		underTest.getReviews(mockModel);
		Mockito.verify(mockModel).addAttribute("reviews", testReviews);
		
	}

}
