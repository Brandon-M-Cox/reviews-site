package wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {

	@Autowired
	private ReviewsRepository reviewsRepo;
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	@Override
	public void run(String... args) throws Exception {

		Category cBus = new Category("Columbus");
		categoryRepo.save(cBus);
		Category cleveland = new Category("Cleveland");
		categoryRepo.save(cleveland);

		Review review1 = new Review(1L, "title", "url", "cat", "con");
		reviewsRepo.save(review1);
		reviewsRepo.save(new Review(1L, "title", "url", "cat", "con"));
		reviewsRepo.save(new Review(1L, "title", "url", "cat", "con"));

	}
}
