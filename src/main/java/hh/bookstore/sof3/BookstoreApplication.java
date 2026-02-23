package hh.bookstore.sof3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import hh.bookstore.sof3.domain.Book;
import hh.bookstore.sof3.domain.BookRepository;
import hh.bookstore.sof3.domain.Category;
import hh.bookstore.sof3.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner seedBooks(BookRepository bookRepository) {
		return args -> {
			log.info("Save some sample books");
			bookRepository.save(new Book("The Myth of Sisyphus", "Albert Camus", 1942, "9780525564454", 12.99F));
			bookRepository
					.save(new Book("The Sickness unto Death", "Søren Kierkegaard", 1849, "9781324091240", 10.99F));

			log.info("Fetch all the books");
			for (Book book : bookRepository.findAll()) {
				log.info(book.toString());
			}
		};
	}

	@Bean
	public CommandLineRunner seedCategories(CategoryRepository categoryRepository) {
		return args -> {
			log.info("Save some sample categories");
			categoryRepository.save(new Category("Philosophy"));
			categoryRepository.save(new Category("Fantasy"));
			categoryRepository.save(new Category("Action"));

			log.info("Fetch all the categories");
			for (Category category : categoryRepository.findAll()) {
				log.info(category.toString());
			}
		};
	}

}
