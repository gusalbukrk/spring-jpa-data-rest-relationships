package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Getter;

// Book entity represents the “many” end of a relationship with the Library entity
@Entity
@Getter
public class Book {

    @Id
    @GeneratedValue
    private long id;
    
    private String title;
    
    @ManyToOne
    // @JoinColumn(name="library_id") // `name="library_id"` already is the default
    private Library library;
}
