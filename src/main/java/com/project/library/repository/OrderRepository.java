package com.project.library.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.library.domain.Order;
import com.project.library.domain.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

    Order save(Order order);

    List<Order> findAll();

    Order findByOrderId(long orderId);

    List<Order> findByUser(User user);

    void deleteByUser(User user);

    void deleteByOrderId(long orderId);

    void deleteAll();
}
