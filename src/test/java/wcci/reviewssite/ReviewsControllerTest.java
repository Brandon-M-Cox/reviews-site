package wcci.reviewssite;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import wcci.library.Book;
import wcci.library.BookController;
import wcci.library.BookRepository;

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

	@Test
	public void shouldReturnOneReview() {
		Review testReview = new Review(1,"Title1","imageUrl1", "content1", "category1");
		List<Review > testReviews= Collections.singletonList(testReview);
		Mockito.when(mockRepo.findAllReviews()).thenReturn(testReviews);
		underTest.getReviews(mockModel);
		Mockito.verify(mockModel).addAttribute("reviews", testReviews);
		
	}
	@Test
	public void shouldReturnAllReviews() {
		Review testReview1 = new Review(1,"Title1","imageUrl1", "content1", "category1");
		Review testReview2 = new Review(2,"Title1","imageUrl1", "content1", "category1");
		Review testReview3 = new Review(3,"Title1","imageUrl1", "content1", "category1");
		List<Review > testReviews= Collections.singletonMap(testReview1,testReview2,testReview3);
		Mockito.when(mockRepo.findAllReviews()).thenReturn(testReviews);
		underTest.getReviews(mockModel);
		Mockito.verify(mockModel).addAttribute("reviews", testReviews);
		
	}

}
