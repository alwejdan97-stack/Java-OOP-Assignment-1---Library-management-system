package Entities;

import Behaviours.LibraryInterface;

import java.util.List;
import java.util.UUID;

public class LibraryItem{
    private String id;
    private String title;
    private Boolean status;

    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setStatus(Boolean status){
        this.status=status;
    }
    public Boolean getStatus(){
        return status;
    }

    public void borrowItem(){
        this.status=false;
    }
    public void returnItem(){
        this.status=true;
    }
}
