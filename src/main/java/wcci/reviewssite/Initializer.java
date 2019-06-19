package wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {

	@Autowired
	private ReviewRepository reviewRepo;
	
	@Autowired
	private CategoryRepository categoryRepo;
	
	@Override
	public void run(String... args) throws Exception {

		Category cBus = new Category("Columbus");
		categoryRepo.save(cBus);
		Category cleveland = new Category("Cleveland");
		categoryRepo.save(cleveland);

		reviewRepo.save(new Review(1L, "title", "url", cBus, "con"));
		reviewRepo.save(new Review(2L, "title", "url", cBus, "con"));
		reviewRepo.save(new Review(3L, "title", "url", cBus, "con"));


	}
}
