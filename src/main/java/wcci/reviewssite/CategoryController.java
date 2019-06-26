package wcci.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/categories")
public class CategoryController {

	@Resource
	private CategoryRepository categoryRepo;

	@Resource
	private ReviewRepository reviewRepo;

	@RequestMapping("/")
	public String findAll(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";

	}

	@RequestMapping("/{name}")
	public String findAllReviews(@PathVariable String name, Model model) {
		model.addAttribute("category", categoryRepo.findByName(name));
		return "category";
	}
	
	@PostMapping("/add")
	public String addReview(String title, String categoryName, String content) {
		Category category = categoryRepo.findByName(categoryName);
		Review newReview = new Review(title, "", category , content);
		reviewRepo.save(newReview);
		
		return "redirect:/categories/" + categoryName ;
	}

//	@PostMapping("/add-category")
//	public String addCategory(String name) {
//		Category categoryToAdd = new Category(name);
//		
//		if(categoryRepo.findByName(categoryToAdd.getName()) == null) {
//			categoryRepo.save(categoryToAdd);
//		}
//		return "redirect:/all-categorys";
//	}
}
