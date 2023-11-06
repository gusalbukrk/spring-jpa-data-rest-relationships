package com.example.demo;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

// Book entity represents the “many” end of a relationship with the Library entity
@Entity
@Getter
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String title;
    
    @ManyToOne
    // @JoinColumn(name="library_id") // `name="library_id"` already is the default
    private Library library;

    // `mappedBy` is the field that owns the relationship
    // in one-to-one relationships, the table containing the foreign key is the owner
    // in many-to-one relationships, the many side is the owner
    // in many-to-many relationships, either side may be the owner
    @ManyToMany(mappedBy = "books")
    private List<Author> authors;
}
