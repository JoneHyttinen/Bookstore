package hh.bookstore.sof3.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import hh.bookstore.sof3.domain.Book;

@Controller
public class BookController {
    private List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book("The Myth of Sisyphus", "Albert Camus", 1942, "978-0-525-56445-4", 15.30F));
        books.add(new Book("To Your Eternity 1", "Yoshitoki Oima", 2017, "978-1-63236-571-2", 13.40F));
    }

    @GetMapping("/index")
    public String getBooks(Model model) {
        model.addAttribute("books", books);
        return "index"; // index.html
    }
}
