import java.util.ArrayList;

public class Store {
    private ArrayList<Book> books;


    public Store() {
        this.books = new ArrayList<Book>();
    }
     
    public Book getBook(int index) {
        return new Book(this.books.get(index));
    }

    public void setBook(int index, Book book) {
        this.books.set(index, new Book(book));
    }

    public void addBook(Book book) {
        this.books.add(new Book(book));
    }

    public boolean contains(Book book) {
        return this.books.contains(book);
    }

    public void sellBook(String title) {
        for (int i = 0; i < this.books.size(); i++) {
            if (books.get(i).getTitle().equals(title)) {
                this.books.remove(i);
            }
        }
    }

    public void printAllBooks() {
        System.out.println("\nList of Books in the Store:\n");
        for (int i = 0; i < this.books.size(); i++) {
            Book book = this.books.get(i);
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Rating: " + book.getRating());
            System.out.println("Price: $" + book.getPrice());
            System.out.println("-----------------------------\n");
        }
    }
}
