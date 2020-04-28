import java.util.ArrayList;

public class Library {
    
    private int capacity;
    private ArrayList<Book> bookCollection;
    
    public Library(int capacity){
        this.capacity = capacity;
        this.bookCollection = new ArrayList<Book>();

    }

    public int getCapacity(){
        return capacity;
    }

    public boolean hasCapacity() {
        return capacity > bookCollection.size();
    }

    public void addBook(Book book) {
        if (hasCapacity()){
            this.bookCollection.add(book);
        }
    }

    public int bookCount() {
        return this.bookCollection.size();
    }
}
