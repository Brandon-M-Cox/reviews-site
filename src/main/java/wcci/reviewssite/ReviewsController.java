package wcci.reviewssite;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	@PostMapping("/add")
	public String addReview(Long id, String title, String category, String content, String imageUrl) {
		reviews.add(new Review(id, title, category, content, imageUrl));
		return "redirect:/reviews/";
	}

}
