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
		model.addAttribute("reviews", reviews.findAll());
		return "reviews";
	}

	@RequestMapping("/{id}")
	public String getReview(@PathVariable("id") long id, Model model) {
		model.addAttribute("review", reviews.findById(id));
		return "review";
	}
	@PostMapping("/add")
	public String addReview(Long id, String title, String imageUrl, Category category, String content) {
		reviews.save(new Review(title, imageUrl, category, content));
		return "redirect:/reviews/";
	}

}
