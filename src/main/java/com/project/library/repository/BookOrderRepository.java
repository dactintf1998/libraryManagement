package com.project.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.library.domain.BookOrder;

public interface BookOrderRepository extends JpaRepository<BookOrder, Long> {

    BookOrder save(BookOrder bookOrder);

    List<BookOrder> findAll();

    BookOrder findById(long id);

    List<BookOrder> findByOrderId(long orderId);

    void deleteById(long id);

    void deleteByOrderId(long orderId);

    void deleteAll();
}