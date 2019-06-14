package wcci.reviewssite;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReviewsController {

	@Resource
	ReviewRepository reviews;

	@RequestMapping("/reviews/")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviews.findAllReviews());
		return "reviews";
	}

	@RequestMapping("/reviews/{id}")
	public String getReview(@PathVariable("id") long id, Model model) {
		model.addAttribute("review", reviews.findReview(id));
		return "review";
	}

}
