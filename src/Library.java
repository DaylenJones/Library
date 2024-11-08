public class Library {

    public String name;
    public static int totalBooks = 0;


    public void addBooks(int numBooks) {
        totalBooks += numBooks; /
    }


    public static int getTotalBooks() {
        return totalBooks;
    }
}

public class App {
    public static void main(String[] args) {


        Library libraryA = new Library();
        libraryA.name = "Library A";
        libraryA.addBooks(100);

        /
        Library libraryB = new Library();
        libraryB.name = "Library B";
        libraryB.addBooks(150);


        System.out.println("Total books in all libraries: " + Library.getTotalBooks());
    }
}
