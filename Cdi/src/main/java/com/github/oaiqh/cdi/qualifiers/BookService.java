package com.github.oaiqh.cdi.qualifiers;

import javax.inject.Inject;

public class BookService {

  @Inject @ISBN @TenDigits
  private ISBNGenerator isbnGenerator;

  public Book createBook(String title) {
    Book book = new Book();
    book.setIsbn(isbnGenerator.generate());
    return book;
  }
}
