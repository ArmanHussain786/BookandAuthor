package com.example.booksample;

import java.util.HashMap;

public class BookRepository {

    private HashMap<String,Book> book_db;
    private HashMap<String,Author> author_db;

    public BookRepository() {
        this.book_db = new HashMap<>();
        this.author_db = new HashMap<>();
    }

    public String addBook(Book book) {
        if(book_db.containsKey(book.getBookName()))
            return "Book is already in the database";
        book_db.put(book.getBookName(),book);
        return "Book added successfully";
    }

    public String addAuthor(Author author) {
        if(author_db.containsKey(author.getName()))
            return "Author is already present in the database";
        author_db.put(author.getName(),author);
        return "Author added succesfully";
    }

    public String getHighestNumberOfPages() {
        String bookName="";
        int maxPages=0;
        for(Book book : book_db.values())
        {
            if(book.getPages()>maxPages)
            {
                maxPages=book.getPages();
                bookName=book.getBookName();
            }
        }
        return bookName;

    }

    public void updateBookPages(String bookName, int extraPages) {
        int oldPages = book_db.get(bookName).getPages();
        book_db.get(bookName).setPages(oldPages+extraPages);
    }

    public int findtopRated(int ratings) {
        int topRatedBooks=0;
        for(Book book : book_db.values())
        {
            String authorName = book.getAuthorName();
            if(author_db.get(authorName).getRatings()>ratings)
                topRatedBooks++;
        }
        return topRatedBooks;
    }
}
