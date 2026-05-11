package com.project.library.domain;

import java.util.List;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private int year;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private String detailDescription;

    @Column(nullable = false)
    private String shortDescription;

    @Column(nullable = false)
    private long stockQuantity = 0;

    @Column(nullable = false)
    private long soldQuantity = 0;

    @Column(nullable = false)
    private String tag;

    @Column(nullable = false)
    private long price;

    @OneToMany(mappedBy = "book")
    private List<BookOrder> bookOrders;

    public Book() {
    }

    public Book(long id, String name, String author, int year) {
        this.bookId = id;
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book(long id, String name, String author, int year, String image, String detailDescription,
            String shortDescription, long stockQuantity, long soldQuantity, String tag, long price) {
        this.bookId = id;
        this.name = name;
        this.author = author;
        this.year = year;
        this.image = image;
        this.detailDescription = detailDescription;
        this.shortDescription = shortDescription;
        this.stockQuantity = stockQuantity;
        this.soldQuantity = soldQuantity;
        this.tag = tag;
        this.price = price;
    }

    public long getBookId() {
        return bookId;
    }

    public void setId(int id) {
        this.bookId = id;
    }

    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public long getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(long stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public long getSoldQuantity() {
        return soldQuantity;
    }

    public void setSoldQuantity(long soldQuantity) {
        this.soldQuantity = soldQuantity;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBookId(long id) {
        this.bookId = id;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
