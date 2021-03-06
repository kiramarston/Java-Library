import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> collection;

    public Borrower(String name){
        this.name = name;
        this.collection = new ArrayList<Book>();
    }

    public int checkCollection() {
        return collection.size();
    }

    public void borrowBook(Library library) {
        Book newBook = library.removeBook();
        collection.add(newBook);
    }
}
