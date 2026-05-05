package Services;

import Entities.Book;
import Entities.Library;
import Entities.Magazine;
import Entities.Memeber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MagazineService {
    public List<Magazine> magazineList=new ArrayList<>();
    Memeber member=new Memeber();
    Library library=new Library();
    Magazine magazine=new Magazine();
    public static Scanner scanner=new Scanner(System.in);

    public Magazine addNewMagazine(){
        System.out.println("** Adding new magazine to the library **");
        magazine.setId(UUID.randomUUID());

        System.out.println("Enter magazine title");
        String magazineTitle = scanner.nextLine();
        magazine.setTitle(magazineTitle);

        System.out.println("Enter magazine code");
        String magazineCode = scanner.nextLine();
        magazine.setMagazineCode(magazineCode);

        return magazine;
    }
    public List<Magazine> addNewMagazines(){
        Boolean continueFlag = true;
        while (continueFlag) {
            magazineList.add(addNewMagazine());
            System.out.println( "Enter q to exit, press ENTER to continue for adding more magazines");
            if (scanner.nextLine().equalsIgnoreCase("q")) {
                continueFlag = false;
            }
        }

        return magazineList;
    }
}
