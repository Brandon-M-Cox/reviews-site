package wcci.reviewssite;

import java.util.HashMap;
import java.util.Map;

public class Repository {

	private Map<Long, Review> reviewMap = new HashMap<>();

	public int getReviews() {
		return reviewMap.size();
	}


//	public void addReview(Review review) {
//		reviewMap.put(1L)
//		
//	}


}
