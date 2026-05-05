package Entities;

import java.util.List;
import java.util.UUID;

public class ParentAddress {
    private UUID id;
    private String name;
    private String phoneNumber;
    private List<Magazine> magazineList;
    private List<Book> bookList;
    private List<Memeber> memeberList;


    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void findById(UUID id) {
        this.id = id;
    }

    public void displayByName(String name) {
        this.name = name;
    }

    public void setMagazineList(List<Magazine> magazineList) {
        this.magazineList = magazineList;
    }

    public List<Magazine> getMagazineList() {
        return magazineList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setMemeberList(List<Memeber> memeberList) {
        this.memeberList = memeberList;
    }

    public List<Memeber> getMemeberList() {
        return memeberList;
    }
}
