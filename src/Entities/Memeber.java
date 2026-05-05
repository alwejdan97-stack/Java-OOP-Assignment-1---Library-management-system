package Entities;

import Behaviours.MemberInterface;

public class Memeber extends ParentAddress implements MemberInterface {
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
