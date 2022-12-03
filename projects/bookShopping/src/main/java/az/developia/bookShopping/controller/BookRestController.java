package az.developia.bookShopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import az.developia.bookShopping.dao.BookDAO;
import az.developia.bookShopping.model.Book;

@RestController
@RequestMapping(path="/books")
public class BookRestController {
	@Autowired
	private BookDAO bookDAO;
@GetMapping
public  List<Book>findAll(){
	
	return bookDAO.findAll();
}

}
