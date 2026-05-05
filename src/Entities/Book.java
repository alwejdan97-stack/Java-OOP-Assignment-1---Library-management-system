package Entities;

import Behaviours.ItemInterface;

public class Book extends ParentItems implements ItemInterface {
    @Override
    public Boolean borrowBookStatus(Book book) {
        return null;
    }

    @Override
    public Boolean borrowBookStatus(Magazine magazine) {
        return null;
    }

    @Override
    public Boolean returnBookStatus(Book book) {
        return null;
    }

    @Override
    public Boolean returnMagazineStatus(Magazine magazine) {
        return null;
    }
}
