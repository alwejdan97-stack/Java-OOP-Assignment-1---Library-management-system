package Behaviours;

import Entities.Book;
import Entities.Magazine;

public interface ItemInterface {
    Boolean borrowBookStatus(Book book);
    Boolean borrowBookStatus(Magazine magazine);
    Boolean returnBookStatus(Book book);
    Boolean returnMagazineStatus(Magazine magazine);
}
