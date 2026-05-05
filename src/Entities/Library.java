package Entities;

import Behaviours.LibraryInterface;

import java.util.List;

public class Library extends ParentAddress implements LibraryInterface {
    private List<Magazine> magazineList;
    private List<Book> bookList;
    private List<Memeber> memeberList;

    public void setMagazineList(List<Magazine> magazineList){
        this.magazineList=magazineList;
    }
    public List<Magazine> getMagazineList(){
        return magazineList;
    }
    public void setBookList(List<Book> bookList){
        this.bookList=bookList;
    }
    public List<Book> getBookList(){
        return bookList;
    }
    public void setMemeberList(List<Memeber> memeberList){
        this.memeberList=memeberList;
    }
    public List<Memeber> getMemeberList(){
        return memeberList;
    }


    @Override
    public Boolean registerMember(Memeber memeber) {
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
