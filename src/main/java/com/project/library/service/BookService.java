package com.project.library.service;

import java.util.List;

import com.project.library.domain.Book;
import com.project.library.repository.BookRepository;

public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();
    }

    public Book getBookById(long id) {
        return this.bookRepository.findById(id);
    }

    public List<Book> searchBooksByName(String name) {
        return this.bookRepository.findBookByName(name);
    }

    public List<Book> getBookByAuthor(String author) {
        return this.bookRepository.findBookByAuthor(author);
    }

    public void createBook(Book book) {
        this.bookRepository.save(book);
    }

    public void updateBook(Book book, Book newBook) {
        book.setAuthor(newBook.getAuthor());
        book.setName(newBook.getName());
        book.setYear(newBook.getYear());
        book.setImage(newBook.getImage());
        book.setDetailDescription(newBook.getDetailDescription());
        book.setShortDescription(newBook.getShortDescription());
        book.setStockQuantity(newBook.getStockQuantity());
        book.setSoldQuantity(newBook.getSoldQuantity());
        book.setTag(newBook.getTag());
        book.setPrice(newBook.getPrice());
        this.bookRepository.save(book);

    }

    public void deleteBook(long id) {
        this.bookRepository.deleteById(id);
    }

}
