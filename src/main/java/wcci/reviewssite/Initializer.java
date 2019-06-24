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
		Category zoo = new Category("Wild");
		categoryRepo.save(zoo);
		Category city = new Category("Canton");
		categoryRepo.save(city);
		Category state = new Category("Ohio");
		categoryRepo.save(state);

		reviewRepo.save(new Review(1L, "title1", "url", cBus, "con"));
		reviewRepo.save(new Review(2L, "title2", "url", cleveland, "con"));
		reviewRepo.save(new Review(3L, "title3", "url", cBus, "con"));
		reviewRepo.save(new Review(4L, "title4", "url", cBus, "con"));
		reviewRepo.save(new Review(5L, "title5", "url", cBus, "con"));

	}
}
