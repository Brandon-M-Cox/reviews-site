package wcci.reviewssite;

import java.util.Collection;


import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviewMap = new HashMap<>();

	public ReviewRepository() {
		reviewMap.put(1L, new Review(1L, "title", "url", "cat", "con"));
		reviewMap.put(2L, new Review(2L, "title2", "url2", "cat2", "con2"));

	}

	public Review findReview(Long id) {
		return reviewMap.get(id);

	}

	public Collection<Review> findAllReviews() {
		return reviewMap.values();
	}

}
