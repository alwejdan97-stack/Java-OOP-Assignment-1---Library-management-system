package Entities;

import Behaviours.MemberInterface;

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
