package com.project.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.library.domain.Book;

import jakarta.transaction.Transactional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    Book save(Book book);

    List<Book> findAll();

    Book findById(long id);

    List<Book> findBookByName(String name);

    List<Book> findBookByAuthor(String author);

    @Transactional
    void deleteById(long id);

    void deleteAll();
}
