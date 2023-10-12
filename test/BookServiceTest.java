import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import book.Book;
import book.BookRepository;
import book.BookService;

import java.util.ArrayList;
import java.util.List;

public class BookServiceTest {
    private BookService bookService;
    private BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        bookRepository = mock(BookRepository.class);
        bookService = new BookService(bookRepository);
    }

    @Test
    void testFindBookById() {
        String bookId = "1";
        Book expectedBook = new Book(bookId, "Book 1", "Author 1");
        when(bookRepository.findById(bookId)).thenReturn(expectedBook);

        Book result = bookService.findBookById(bookId);

        assertEquals(expectedBook, result);
    }

    @Test
    void testFindAllBooks() {
        List<Book> expectedBooks = new ArrayList<>();
        expectedBooks.add(new Book("1", "Book 1", "Author 1"));
        expectedBooks.add(new Book("2", "Book 2", "Author 2"));

        when(bookRepository.findAll()).thenReturn(expectedBooks);
        List<Book> result = bookService.findAllBooks();

        assertEquals(expectedBooks, result);
    }
}
