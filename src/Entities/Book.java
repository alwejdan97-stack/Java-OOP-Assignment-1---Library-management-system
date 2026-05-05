package Entities;

import Behaviours.ItemInterface;

public class Book extends LibraryItem{
    private String bookCode;

    public void setBookCode(String bookCode){
        this.bookCode=bookCode;
    }
    public String getBookCode(){
        return bookCode;
    }
}
