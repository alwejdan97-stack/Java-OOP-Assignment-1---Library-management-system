package Services;

import Entities.LibraryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class LibraryItemService {
    List<LibraryItem> itemList =new ArrayList<>();
    LibraryItem libraryItem=new LibraryItem();
    public static Scanner scanner=new Scanner(System.in);

    /*public List<LibraryItem> addItem(LibraryItem item){
        System.out.println("** Adding new item to the library **");

        System.out.println("Enter item name");
        String item = scanner.nextLine();
        libraryItem.setTitle(item);

        System.out.println("Enter item code");
        String code = scanner.nextLine();
        ;

        return book;
        System.out.println("");
        itemList.add(item);
        return itemList;
    }*/
    public LibraryItem findById(String id) {
        for(LibraryItem l: itemList){
            if(l.getId().equals(l)){
                System.out.println("Item is found");
                return l;
            }
        }
        return libraryItem;
    }

    public void searchByTitle(){
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
