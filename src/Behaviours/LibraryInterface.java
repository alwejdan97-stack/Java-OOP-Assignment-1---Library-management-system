package Behaviours;

import Entities.Book;
import Entities.Magazine;
import Entities.Memeber;

public interface LibraryInterface {
    Boolean registerMember(Memeber memeber);
    Boolean addMagazine(Magazine magazine);
    Boolean addBook(Book book);
    void displayMagazine();
    void displayBook();
}
