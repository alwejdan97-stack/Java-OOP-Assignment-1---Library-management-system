package Entities;

import java.util.List;

public class Library extends ParentAddress{
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
}
