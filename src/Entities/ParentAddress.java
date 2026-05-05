package Entities;

import java.util.UUID;

public class ParentAddress {
    private UUID id;
    private String name;
    private String phoneNumber;

    public void setId(UUID id){
        this.id=id;
    }
    public UUID getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void findById(UUID id){
        this.id=id;
    }
    public void displayByName(String name){
        this.name=name;
    }

}
