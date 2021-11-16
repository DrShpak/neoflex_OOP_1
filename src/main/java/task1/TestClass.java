package task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class TestClass {
    private ContactBook book = new ContactBook();

    @BeforeEach
    public void setup() {
        book.addContact("Putin", "111");
        book.addContact("Limonov", "222");
        book.addContact("Ronaldo", "333");
        book.addContact("Ronaldo", "444");
        book.addContact("Putina Ludmila", "555");
    }

    @Test
    public void testAdd() {
        book.addContact("Lebron", "909");
        assertEquals(6, book.getContacts().size());
    }

    @Test
    public void addExistedContact() {
        book.addContact("Ronaldo", "333");
        assertEquals(5, book.getContacts().size());
    }

    @Test
    public void getPhonesByExistedName() {
        assertArrayEquals(book.getNumbersByName("Ronaldo"), new String[]{"333", "444"});
    }

    @Test
    public void getPhonesByNonexistedName() {
        assertNull(book.getNumbersByName("Medvedev"));
    }

    @Test
    public void getContactsByPartOfName() {
        var actual = book.getAllContactsByPartOfName("Put");
        assertEquals(2, actual.length);
    }
}
