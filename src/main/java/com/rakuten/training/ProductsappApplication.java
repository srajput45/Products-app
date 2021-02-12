package com.rakuten.training;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.rakuten.training.dal.ProductRepository;
import com.rakuten.training.dal.ReviewDAO;
import com.rakuten.training.dal.ReviewRepository;
import com.rakuten.training.domain.Product;
import com.rakuten.training.domain.Review;
import com.rakuten.training.service.ReviewService;
import com.rakuten.training.service.ReviewServiceImpl;
import com.rakuten.training.ui.ProductConsoleUi;

@SpringBootApplication
public class ProductsappApplication {

	public static void main(String[] args) {
//		ApplicationContext springContainer = 
		SpringApplication.run(ProductsappApplication.class, args);

//		ProductConsoleUi ui = springContainer.getBean(ProductConsoleUi.class);
//		ui.createProductWithUi();

//		testReviewAssciation(springContainer);

//		testProductRepository(springContainer);

//		testReviewRepository(springContainer);
	}

	private static void testReviewRepository(ApplicationContext springContainer) {
		ReviewRepository revRepo = springContainer.getBean(ReviewRepository.class);
		System.out.println(revRepo.findById(1));

	}

	private static void testProductRepository(ApplicationContext springContainer) {

		ProductRepository repo = springContainer.getBean(ProductRepository.class);
		Product p = new Product("repo", 10000, 10);
//		Product saved = repo.save(p);
//		System.out.println("Saved a product with id: " + saved.getId());
		List<Product> find = repo.findByNameLike("test");
		for (Product product : find) {
			System.out.println(product.getId());
		}
		List<Product> find2 = repo.myComplexQuery(2);
		for (Product product : find2) {
			System.out.println(product.getName());
		}

	}

	private static void testReviewAssciation(ApplicationContext springContainer) {

//		Review aReview = new Review("self", "very good", 5);
//		ReviewDAO dao = springContainer.getBean(ReviewDAO.class);
//		dao.save(aReview);

		Review aReview = new Review("self", "very good", 5);

		ReviewService svc = springContainer.getBean(ReviewService.class);

		svc.addReviewToProduct(aReview, 6);
	}

}
