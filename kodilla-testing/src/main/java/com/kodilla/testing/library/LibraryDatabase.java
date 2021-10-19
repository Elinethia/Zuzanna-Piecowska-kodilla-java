package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    //title beginning with titleFragment
    List<Book> listBooksWithCondition(String titleFragment);

    //borrowed
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);

    boolean rentABook(LibraryUser libraryUser, Book book);

    int returnBooks(LibraryUser libraryUser);

}
