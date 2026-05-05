package Behaviours;

import Entities.Book;
import Entities.Magazine;
import Entities.Member;

public interface LibraryInterface {
    Boolean registerMember(Member memeber);
    Boolean addMagazine(Magazine magazine);
    Boolean addBook(Book book);
    void displayMagazine();
    void displayBook();
}
