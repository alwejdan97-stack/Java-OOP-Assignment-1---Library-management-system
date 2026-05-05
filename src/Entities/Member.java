package Entities;

import Behaviours.MemberInterface;

import java.util.List;

public class Member extends Address{
    private List<LibraryItem> borrowItemList;

    /*public void borrowBook(Book book) {
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
        if (!(magazine.equals(null) && magazine.getId().equals(null))) {
            List<Magazine> tempMagazineList = this.getMagazineList();
            tempMagazineList.add(magazine);
            this.setMagazineList(tempMagazineList);
            System.out.println("Magazine has been borrowed for this member");
        } else {
            System.out.println("Member borrowing has FAILED");
        }
    }*/
    /*public void returnBook(Integer bookIdToReturn) {
        List<Book> tempBookList = this.getBookList();
        for(Book b:tempBookList){
            if(b.getId().equals(b)){
                tempBookList.remove(b);
            }
        }
        this.setBookList(tempBookList);
    }*/

    /*public void returnMagazine(Integer magazineIdToReturn) {
        List<Magazine> tempMagazineList = this.getMagazineList();
        for(Magazine m:tempMagazineList){
            if(m.getId().equals(m)){
                tempMagazineList.remove(m);
            }
        }
        this.setMagazineList(tempMagazineList);
    }*/

    public void borrowItem(LibraryItem item){
        borrowItemList.add(item);
    }
    public void returnItem(LibraryItem item){
        borrowItemList.remove(item);
    }
}
