package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Getter;

@Entity
@Getter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @ManyToMany
    // @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // cascade, fetch customization
    // @JoinTable(
    //     name = "book_author", // defaults to `author_books`
    //     joinColumns = @JoinColumn(name = "book_id", referencedColumnName = "id"), // default name is `books_id`
    //     inverseJoinColumns = @JoinColumn(name = "author_id", referencedColumnName = "id") // default name is `authors_id`
    // )
    private List<Book> books;
}
