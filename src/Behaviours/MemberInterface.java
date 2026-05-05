package Behaviours;

import Entities.Book;
import Entities.Magazine;

public interface MemberInterface {
    void borrowBook(Book book);
    void borrowMagazine(Magazine magazine);
    void returnBook(Integer bookIdToReturn);
    void returnMagazine(Integer magazineIdToReturn);
}
