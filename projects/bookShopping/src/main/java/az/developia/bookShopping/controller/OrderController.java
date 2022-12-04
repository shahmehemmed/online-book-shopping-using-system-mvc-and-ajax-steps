package az.developia.bookShopping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import az.developia.bookShopping.dao.BookDAO;

import az.developia.bookShopping.model.Book;

@Controller
public class OrderController {

	

	@GetMapping(path = "/orders")
	public String showOrdersPage() {
		
		return "/orders";
	}

	
}
