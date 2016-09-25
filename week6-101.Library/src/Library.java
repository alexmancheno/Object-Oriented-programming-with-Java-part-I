
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library = new ArrayList<Book>();
    
    
    public Library () {
        this.library = new ArrayList<Book>();
    }
    
    public void addBook (Book newBook) {
        this.library.add(newBook);
    }
    
    public void printBooks () {
        for (Book books: library) {
            System.out.println(books);
        }
    }
    
    public ArrayList<Book> searchByTitle (String title) {
        ArrayList<Book> list = new ArrayList<Book>();
        for (Book books: library) {
            if (StringUtils.included(books.title(), title)) {
                list.add(books);
            }
        }
        return list;
    }
    
    public ArrayList<Book> searchByPublisher (String publisher) {
        ArrayList<Book> list = new ArrayList<Book>();
        for (Book books: library) {
            if (StringUtils.included(books.publisher(), publisher)) {
                list.add(books);
            }
        }
        return list;
    }
    
    public ArrayList<Book> searchByYear (int year) {
        ArrayList<Book> list = new ArrayList<Book>();
        for (Book books: library) {
            if (books.year() == year) {
                list.add(books);
            }
        }
        return list;
    }
}
