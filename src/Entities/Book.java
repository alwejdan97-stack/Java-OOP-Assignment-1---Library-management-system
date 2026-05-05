package Entities;

import Behaviours.ItemInterface;

public class Book extends ParentItems{
    private String bookCode;
    private String magazineCode;

    public void setBookCode(String bookCode){
        this.bookCode=bookCode;
    }
    public String getBookCode(){
        return bookCode;
    }
    public void setMagazineCode(String magazineCode){
        this.magazineCode=magazineCode;
    }
    public String getMagazineCode(){
        return magazineCode;
    }
}
