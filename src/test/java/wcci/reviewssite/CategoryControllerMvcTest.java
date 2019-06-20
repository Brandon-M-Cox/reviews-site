package wcci.reviewssite;
import static org.hamcrest.CoreMatchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import java.util.Arrays;
import java.util.Collection;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import wcci.reviewssite.Category;
import wcci.reviewssite.CategoryController;
import wcci.reviewssite.CategoryRepository;

@RunWith(SpringRunner.class)
@WebMvcTest(CategoryController.class)
public class CategoryControllerMvcTest {

	@Resource
	private MockMvc mvc;

	@MockBean
	private CategoryRepository categoryRepo;

	@Mock
	private Category categoryOne;

	@Mock
	private Category categoryTwo;

	@Test
	public void shouldReturnAStatusOfOk() throws Exception {
		Collection<Category> categorys = Arrays.asList(categoryOne, categoryTwo);
		when(categoryRepo.findAll()).thenReturn(categorys);
		mvc.perform(get("/all-categorys")).andExpect(view().name(is("categorysTemplate")));
	}
	
	@Test
	public void addCategoryTest() throws Exception {

		Category categoryToAdd = new Category("San Diego");

		mvc.perform(post("/add-category").contentType(MediaType.APPLICATION_JSON).content(toJson(categoryToAdd)))
				.andExpect(status().is3xxRedirection());
	}

	private String toJson(Category newCategory) {
		return newCategory.getName();
	}
}

