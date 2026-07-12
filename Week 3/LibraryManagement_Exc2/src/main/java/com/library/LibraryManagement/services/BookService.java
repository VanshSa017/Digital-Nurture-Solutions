package com.library.LibraryManagement.services;
import com.library.LibraryManagement.repository.*;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    // Setter Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void show() {
        System.out.println("Book Service Called");
        bookRepository.display();
    }
}