package hh.bookstore.sof3.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import hh.bookstore.sof3.domain.Book;
import hh.bookstore.sof3.domain.BookRepository;

@Controller
public class BookController {

    private final BookRepository repository;

    public BookController(BookRepository bookRepository) {
        this.repository = bookRepository;
    }

    @GetMapping("/booklist")
    public String getBooks(Model model) {
        model.addAttribute("books", repository.findAll());
        return "booklist"; // booklist.html
    }

    @GetMapping("/add")
    public String addBook(Model model) {
        model.addAttribute("book", new Book());
        return "addbook"; // addbook.html
    }

    @PostMapping("/save")
    public String save(Book book) {
        repository.save(book);
        return "redirect:booklist";
    }

    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        repository.deleteById(id);
        return "redirect:../booklist";
    }

}
