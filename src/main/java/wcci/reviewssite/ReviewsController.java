package wcci.reviewssite;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reviews")
public class ReviewsController {

	@Resource
	ReviewRepository reviews;

	@RequestMapping("/")
	public String getReviews(Model model) {
		model.addAttribute("reviews", reviews.findAllReviews());
		return "reviews";
	}

	@RequestMapping("/{id}")
	public String getReview(@PathVariable("id") long id, Model model) {
		model.addAttribute("review", reviews.findReview(id));
		return "review";
	}

}
