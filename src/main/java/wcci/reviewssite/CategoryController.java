package wcci.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	@Resource
	private CategoryRepository categoryRepo;
	
	@RequestMapping("/categories")
	public String findAll(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
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

