import Entities.Address;
import Entities.Book;
import Entities.Magazine;
import Entities.Member;
import Services.BorrowReturnService;
import Services.LibraryItemService;
import Services.MemberService;

import java.util.Scanner;

public class Main {
    static LibraryItemService libraryItemService;
    static MemberService memberService;
    static BorrowReturnService borrowReturnService;
    static Scanner scanner = new Scanner(System.in);
    Magazine magazine= new Magazine();
    Book book= new Book();
    Address address=new Address();
    Member member=new Member();
    /*LibraryItemService libraryItemService= new LibraryItemService();
    MemberService memberService=new MemberService();
    BorrowReturnService borrowReturnService=new BorrowReturnService();*/


    public void start() {
        Boolean start=true;
        while (start) {
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. List ALL Items");
            System.out.println("4. Search Item");
            System.out.println("5. Add Member");
            System.out.println("6. List Members");
            System.out.println("7. Borrow Item");
            System.out.println("8. Return Item");
            System.out.println("9. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    addBook();
                    start();
                }
                case 2 -> {
                    addMagazine();
                    start();
                }
                case 3 -> {
                    libraryItemService.displayItems();
                    start();
                }
                case 4 -> {
                    search();
                    start();
                }
                case 5 -> {
                    addMember();
                    start();
                }
                case 6 -> {
                    memberService.displayMembers();
                    start();
                }
                case 7 -> {
                    borrow();
                    start();
                }
                case 8 -> {
                    returnItem();
                    start();
                }
                case 9 -> System.exit(0);
            }
        }
    }

    private void addBook() {
        return;
    }

    private void addMagazine() {
        return;
    }

    private void addMember(){
        return;
    }

    private void borrow() {
        System.out.println("== Borrowing ==");
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Item ID: ");
        String itemId = scanner.nextLine();

        borrowReturnService.borrowItem(memberId, itemId);
    }

    private void returnItem() {
        System.out.print("Member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Item ID: ");
        String itemId = scanner.nextLine();

        borrowReturnService.returnItem(memberId, itemId);
    }

    private void search() {
        System.out.print("Tile: ");
        String title = scanner.nextLine();
        libraryItemService.searchByTitle(title);
    }
}