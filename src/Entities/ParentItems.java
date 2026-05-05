package Entities;

import java.util.UUID;

public class ParentItems {
    private String title;
    private UUID id;
    private Boolean status;


    public void setTitle(String title){
        this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setId(UUID id){
        this.id=id;
    }
    public UUID getId(){
        return id;
    }
    public void setStatus(Boolean status){
        this.status=status;
    }
    public Boolean getStatus(){
        return status;
    }
}
