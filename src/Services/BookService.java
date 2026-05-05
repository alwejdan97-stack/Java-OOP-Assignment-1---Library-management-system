package Services;

import Entities.Book;
import Entities.LibraryItem;
import Entities.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class BookService {
    public List<Book> bookList=new ArrayList<>();
    Member member=new Member();
    LibraryItem library=new LibraryItem();
    Book book=new Book();
    public static Scanner scanner=new Scanner(System.in);

    public Book addNewBook(){
        System.out.println("** Adding new book to the library **");
        book.setId(UUID.randomUUID());

        System.out.println("Enter book title");
        String bookTitle = scanner.nextLine();
        book.setTitle(bookTitle);

        System.out.println("Enter book code");
        String bookCode = scanner.nextLine();
        book.setBookCode(bookCode);

        return book;
    }
    public List<Book> addNewBooks(){
        Boolean continueFlag = true;
        while (continueFlag) {
            bookList.add(addNewBook());
            System.out.println( "Enter q to exit, press ENTER to continue for adding more books");
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }

        return bookList;
    }
}
