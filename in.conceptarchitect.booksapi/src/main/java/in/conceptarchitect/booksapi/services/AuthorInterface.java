package in.conceptarchitect.booksapi.services;

import java.util.List;

import in.conceptarchitect.booksapi.booksmodel.Author;



public interface AuthorInterface {

	void save(Author author);

	List<Author> getAuthors();

	List<Object> authorDetails();

	void deleteAuthor(int id);

	Object BooksById(int id);

	Author getAuthor(Integer id);

}