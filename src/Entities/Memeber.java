package Entities;

import Behaviours.MemberInterface;
import ObjectOrientedProgramming.OOPDemo.Utils.Constants;

import java.util.List;

public class Memeber extends ParentAddress implements MemberInterface {
    private String dateOfBorrow;
    private String dateOfReturn;

    public void setDateOfBorrow(String dateOfBorrow){
        this.dateOfBorrow=dateOfBorrow;
    }
    public String getDateOfBorrow(){
        return dateOfBorrow;
    }
    public void setDateOfReturn(String dateOfReturn){
        this.dateOfReturn=dateOfReturn;
    }
    public String getDateOfReturn(){
        return dateOfReturn;
    }

    @Override
    public void borrowBook(Book book) {
        if (!(book.equals(null) && book.getId().equals(null))) {
            List<Book> tempBookList = this.getBookList();
            tempBookList.add(book);
            this.setBookList(tempBookList);
            System.out.println("Book has been borrowed for this member");
        } else {
            System.out.println("Member borrowing has FAILED");
        }
    }

    @Override
    public void borrowMagazine(Magazine magazine) {

    }

    @Override
    public void returnBook(Integer bookIdToReturn) {

    }

    @Override
    public void returnMagazine(Integer magazineIdToReturn) {

    }
}
