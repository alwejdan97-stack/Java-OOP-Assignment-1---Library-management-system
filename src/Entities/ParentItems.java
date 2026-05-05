package Entities;

import java.util.UUID;

public class ParentItems {
    private String title;
    private UUID id;
    private Boolean status;


    public void setId(UUID id){
        this.id=id;
    }
    public UUID getId(){
        return id;
    }

}
