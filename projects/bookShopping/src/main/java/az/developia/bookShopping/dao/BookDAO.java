package az.developia.bookShopping.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import az.developia.bookShopping.model.Book;

public interface BookDAO extends JpaRepository<Book, Integer> {

}
