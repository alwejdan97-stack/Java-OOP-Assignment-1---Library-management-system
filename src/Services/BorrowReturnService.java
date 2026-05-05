package Services;

import Entities.Book;
import Entities.LibraryItem;
import Entities.Magazine;
import Entities.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class BorrowReturnService {
    Magazine magazine=new Magazine();
    Book book=new Book();
    List<Magazine> magazineList=new ArrayList<>();
    List<Book> bookList=new ArrayList<>();
    LibraryItem library=new LibraryItem();
    Member member=new Member();
    public static Scanner scanner=new Scanner(System.in);

    public void borrowBook(String memberId, String itemId){
        Member member=MemberService.findById();
        LibraryItem library=LibraryItemService.findById();
    }

}
