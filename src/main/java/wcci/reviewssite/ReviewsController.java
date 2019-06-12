package wcci.reviewssite;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewsController {

	Map<Long, Review> reviews = new HashMap<>();
	
	@RequestMapping("/reviews/")
	public String getReviews(Model model) {
		populateReviews();
		model.addAttribute("reviews", reviews.values());
		return "reviews";
	}
	@RequestMapping("/reviews/{id}")
	public String getReview(@PathVariable("id") long id,Model model) {
		populateReviews();
		model.addAttribute("review", reviews.get(id));
		return "review";
	}
	private void populateReviews() {
		if (reviews.isEmpty()) {
			reviews.put(1L, new Review(1L, "Daniel's Check-ins", "daniel.com", "Candy", "He is the goat of all check-ins"));
	}
	
}
}
