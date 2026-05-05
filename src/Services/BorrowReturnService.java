package Services;

import Entities.Book;
import Entities.LibraryItem;
import Entities.Magazine;
import Entities.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BorrowReturnService {
    LibraryItemService libraryItemService=new LibraryItemService();
    MemberService memberService=new MemberService();
    LibraryItem itemList=new LibraryItem();
    Member member=new Member();
    public static Scanner scanner=new Scanner(System.in);

    public void borrowItem(String memberId, String itemId){
        Member member=MemberService.findById(memberId);
        LibraryItem item=LibraryItemService.findById(itemId);
        if(member== null || item==null){
            System.out.println("NOT found");
        }
        member.borrowBook();
    }

    public void returnItem(String memberId, String itemId){
        Member member=MemberService.findById(memberId);
        LibraryItem item=LibraryItemService.findById(itemId);
        if(member== null || item==null){
            System.out.println("NOT found");
        }
    }

}
