package wcci.reviewssite.integrationtests;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import wcci.reviewssite.CategoryRepository;
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
	
	
}
