package hh.bookstore.sof3;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.bookstore.sof3.domain.Book;
import hh.bookstore.sof3.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner seedBooks(BookRepository bookRepository) {
		return args -> {
			bookRepository.save(new Book("The Myth of Sisyphus", "Albert Camus", 1942, "9780525564454", 12.99F));
			bookRepository
					.save(new Book("The Sickness unto Death", "Søren Kierkegaard", 1849, "9781324091240", 10.99F));
		};
	}

}
