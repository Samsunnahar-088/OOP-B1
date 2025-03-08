public class Main {
    public static void main(String[] args) {
        // Composition Example: Library has Books
        String[] bookTitles = {"The Alchemist", "1984", "Java Programming"};
        Library library = new Library(bookTitles);
        System.out.println("Library Books:");
        library.showBooks();

        System.out.println();

        // Aggregation Example: LibrarySystem has a Member
        Member member = new Member("Alice");
        LibrarySystem system = new LibrarySystem(member);
        system.showMember();
    }
}
