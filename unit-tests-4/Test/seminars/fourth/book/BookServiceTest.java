package seminars.fourth.book;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {
    @Test
    public void willReturnAuthorOfTheBookFoundById() {
        Book book = mock(Book.class);
        BookRepository bookRepository = mock(BookRepository.class);
        when(book.getAuthor()).thenReturn("Author1");
        when(bookRepository.findById("1")).thenReturn(book);
        BookService bookService = new BookService(bookRepository);

        assertEquals(bookService.findBookById("1").getAuthor(), "Author1");

    }

    @Test
    public void willReturnAllBooks() {
        Book book1 = mock(Book.class);
        Book book2 = mock(Book.class);
        BookRepository bookRepository = mock(BookRepository.class);
        ArrayList books = mock(ArrayList.class);
        books.add(book1);
        books.add(book2);
        when(bookRepository.findAll()).thenReturn(books);
        BookService bookService = new BookService(bookRepository);

        assertEquals(bookService.findAllBooks(), books);

    }
}