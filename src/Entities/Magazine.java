package Entities;

public class Magazine extends ParentItems{
    private String magazineCode;

    public void setMagazineCode(String magazineCode){
        this.magazineCode=magazineCode;
    }
    public String getMagazineCode(){
        return magazineCode;
    }
}
