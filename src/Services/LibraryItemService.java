package Services;

import Entities.LibraryItem;
import com.sun.security.auth.UnixNumericUserPrincipal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.UUID;

public class LibraryItemService {
    List<LibraryItem> itemList =new ArrayList<>();
    LibraryItem libraryItem=new LibraryItem();
    public static Scanner scanner=new Scanner(System.in);

    public LibraryItem addItem(){
        System.out.println("*** Add new Item ***");
        libraryItem.setId(UUID.randomUUID());
        System.out.println("Enter item title");
        libraryItem.setTitle(scanner.nextLine());
        System.out.println();
        return libraryItem;
    }

    public List<LibraryItem> addItems(){
        Boolean continueFalg=false;
        while(continueFalg){
           itemList.add(addItem());
            System.out.println("Enter c to exit, press ENTER to continue for adding more books");
            if(scanner.nextLine().equalsIgnoreCase("c")){
                continueFalg=true;
            }
        }
        return itemList;
    }

    public LibraryItem findById() {
        displayItems();
        System.out.println("Enter ID to search");
        String id=scanner.nextLine();
        for(LibraryItem l: itemList){
            if(l.getId().equals(l)){
                System.out.println("Item is found");
                return l;
            }
        }
        return libraryItem;
    }

    public void searchByTitle(){
        displayItems();
        System.out.println("Enter item to search");
        String itemToSearch=scanner.nextLine();
        for(LibraryItem l:itemList){
            if(l.getTitle().equalsIgnoreCase(itemToSearch)){
                System.out.println("Item Name: "+l.getTitle()+" | ID: "+l.getId()+" | Status: "l.getStatus());
            }
        }
    }

    public void displayItems(){
        if(itemList.isEmpty()){
            System.out.println("NO item in the list");
        }
        for(LibraryItem l:itemList){
            System.out.println("Title: "+l.getTitle()+" | ID: "+l.getId()+" | Status: "+l.getStatus());
        }
    }
}
