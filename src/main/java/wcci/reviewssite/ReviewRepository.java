package wcci.reviewssite;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviewMap = new HashMap<>();

//	private void populateReviews() {
//		if (reviewMap.isEmpty()) {
//			reviewMap.put(1L,
//					new Review(1L, "Daniel's Check-ins", "daniel.com", "Candy", "He is the goat of all check-ins"));
//		}
//	}
	public ReviewRepository() {
		reviewMap.put(1L,
				new Review(1L, "title", "url", "cat","con"));
		reviewMap.put(2L, new Review(2L, "title2", "url2", "cat2","con2"));

	}
	public Review findReview(Long id) {
		return reviewMap.get(id);
		
	}
	
	}
	
	
	
	
	
	
	
	
	
	
//
//	public int getReviews() {
//		return reviewMap.size();
//	}
//
//	public void addReviews(long id, String title, String imageUrl, String reviewCategory, String reviewContent) {
//		reviewMap.put(id, new Review(id ,title, imageUrl, reviewCategory, reviewContent));
//	}
//
//
//

}
