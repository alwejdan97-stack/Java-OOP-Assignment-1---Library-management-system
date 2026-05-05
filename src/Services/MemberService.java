package Services;

import Entities.Book;
import Entities.Library;
import Entities.Memeber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MemberService {
    Memeber memeber=new Memeber();
    public List<Memeber> memeberList=new ArrayList<>();
    Library library=new Library();
    public static Scanner scanner=new Scanner(System.in);

    public Memeber addNewMember(){
            System.out.println("** Adding new member **");
            memeber.setId(UUID.randomUUID());

            System.out.println("Enter member name");
            String memberName = scanner.nextLine();
            memeber.setName(memberName);

            System.out.println("Enter phone number");
            String phoneNumber = scanner.nextLine();
            memeber.setPhoneNumber(phoneNumber);

            System.out.println("Enter street");
            String street = scanner.nextLine();
            memeber.setStreet(street);

            System.out.println("Enter city");
            String city = scanner.nextLine();
            memeber.setCity(city);

            return memeber;
        }

}
