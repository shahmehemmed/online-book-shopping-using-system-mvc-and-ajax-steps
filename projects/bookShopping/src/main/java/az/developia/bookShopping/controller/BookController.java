package az.developia.bookShopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import az.developia.bookShopping.dao.BookDAO;
import az.developia.bookShopping.model.Book;

@Controller
public class BookController {
@Autowired
private BookDAO bookDAO;
@GetMapping(path="/books")
public String showBooks(Model model) {
	List<Book> books=bookDAO.findAll();
	model.addAttribute("books",books);
	return "books";
}
@GetMapping(path="/books/new")
public String openNewBookPage() {
	
	return "new-book";
}
}
