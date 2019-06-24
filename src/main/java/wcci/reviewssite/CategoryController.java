package wcci.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;

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
	public String getCategory(@PathVariable("name") String name, Model model) {
		model.addAttribute("review", reviewfindOne.));
		return "category";
	}
}
		
	
	
	
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

