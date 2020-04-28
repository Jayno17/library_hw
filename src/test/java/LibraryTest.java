import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;

    @Before
    public void setUp(){
        library = new Library(1);
        book1 = new Book("The Third Man", "Graham Greene", "Thriller");
        book2 = new Book("Neverwhere", "Neil Gaiman", "Fantasy");
    }


    @Test
    public void canCheckCapacity(){
        assertEquals(true, library.hasCapacity());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookIfFull(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(false, library.hasCapacity());
    }



}
