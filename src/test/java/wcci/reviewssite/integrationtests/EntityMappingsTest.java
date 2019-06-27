package wcci.reviewssite.integrationtests;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import wcci.reviewssite.Category;
import wcci.reviewssite.CategoryRepository;
import wcci.reviewssite.Review;
import wcci.reviewssite.ReviewRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EntityMappingsTest {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private CategoryRepository categoryRepo;

	@Autowired
	private ReviewRepository reviewsRepo;
	
	@Test
	public void shoudldSaveAndLoadReview() {
		Category category1 = new Category("category1");
		Review underTest = new Review("", "", category1 , "");
		reviewsRepo.save(underTest);
		categoryRepo.save(category1);
		entityManager.flush();
		entityManager.clear();	
		
		Review foundReview = reviewsRepo.findById(underTest.getId()).get();
		assertThat(foundReview, is (underTest));

	}
	@Test
	public void shouldSaveAndLoadCategory() {
		Category category2 = new Category("category2");
		categoryRepo.save(category2);
		entityManager.flush();
		entityManager.clear();	
		
		Category foundCategory = categoryRepo.findById(category2.getId()).get();
		assertThat(foundCategory, is(category2));
	}
}
