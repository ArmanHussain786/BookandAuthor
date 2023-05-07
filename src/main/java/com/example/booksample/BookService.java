package com.example.booksample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {


    BookRepository bookRepository = new BookRepository();
    public String addBook(Book book) {
        return bookRepository.addBook(book);
    }

    public String addAuthor(Author author) {
        return bookRepository.addAuthor(author);
    }

    public String getHighestNumberOfPages() {
        return bookRepository.getHighestNumberOfPages();
    }
    public void updateBookPages(String bookName,int extraPages)
    {
         bookRepository.updateBookPages(bookName,extraPages);
    }

    public int findtopRated(int ratings) {
        return bookRepository.findtopRated(ratings);
    }
}
