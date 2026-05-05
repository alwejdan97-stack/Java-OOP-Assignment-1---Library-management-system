package Entities;

import Behaviours.LibraryInterface;

import java.util.List;

public class LibraryItem extends ParentAddress implements LibraryInterface {
    public List<Magazine> magazineList;
    public List<Book> bookList;
    public List<Member> memeberList;


    @Override
    public Boolean registerMember(Member memeber) {
        Boolean status=memeberList.add(memeber);
        return status;
    }

    @Override
    public Boolean addMagazine(Magazine magazine) {
        Boolean status=magazineList.add(magazine);
        return status;
    }

    @Override
    public Boolean addBook(Book book) {
        Boolean status=bookList.add(book);
        return status;
    }

    @Override
    public void displayMagazine() {

    }

    @Override
    public void displayBook() {

    }
}
