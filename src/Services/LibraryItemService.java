package Services;

import Entities.LibraryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class LibraryItemService {
    List<LibraryItem> libraryList=new ArrayList<>();
    LibraryItem libraryItem=new LibraryItem();
    public static Scanner scanner=new Scanner(System.in);

    public List<LibraryItem> addItem(LibraryItem item){
        System.out.println("** Adding new item to the library **");
        libraryItem.setId(UUID.randomUUID());

        System.out.println("Enter book title");
        String bookTitle = scanner.nextLine();
        book.setTitle(bookTitle);

        System.out.println("Enter book code");
        String bookCode = scanner.nextLine();
        book.setBookCode(bookCode);

        return book;
        System.out.println("");
        libraryList.add(item);
        return libraryList;
    }
    public LibraryItem findById(String id) {
        for(LibraryItem l: libraryList){
            if(){}
        }
    }
}
