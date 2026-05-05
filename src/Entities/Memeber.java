package Entities;

import Behaviours.MemberInterface;

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
            System.out.println(Constants.STUDENT_COURSE_REGISTERED);
        } else {
            System.out.println(Constants.STUDENT_COURSE_NOT_REGISTERED);
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
