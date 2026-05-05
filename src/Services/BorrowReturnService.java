package Services;

import Entities.Book;
import Entities.LibraryItem;
import Entities.Magazine;
import Entities.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BorrowReturnService {
    private LibraryItemService libraryItemService;
    private MemberService memberService;
    LibraryItem item=new LibraryItem();
    Member member=new Member();
    public static Scanner scanner=new Scanner(System.in);

    public void setLibraryItemService(LibraryItemService libraryItemService){
        this.libraryItemService=libraryItemService;
    }
    public void setMemberService(MemberService memberService){
        this.memberService=memberService;
    }

    public void borrowItem(String memberId, String itemId){
        System.out.println("*** Borrowing Items ***");
        member=memberService.findById();
        item=libraryItemService.findById();
        if(member== null || item==null){
            System.out.println("Item or Member NOT found");
        }
        if(!item.getStatus()){
            System.out.println("Item is borrowed");
        }
        item.borrowItem();
        member.borrowItem(item);
        System.out.println("Successful Borrow");
    }

    public void returnItem(String memberId, String itemId){
        System.out.println("*** Returning Items ***");
        member=memberService.findById();
        item=libraryItemService.findById();
        if(member== null || item==null){
            System.out.println("Item or Member NOT found");
        }
        item.returnItem();
        member.returnItem(item);
        System.out.println("Successful Return");
    }

}
