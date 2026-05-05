package Services;

import Entities.LibraryItem;
import Entities.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class MemberService {
    Member memeber=new Member();
    public List<Member> memeberList=new ArrayList<>();
    LibraryItem libraryItem=new LibraryItem();
    public static Scanner scanner=new Scanner(System.in);

    public Member addNewMember(){
            System.out.println("*** Adding new member ***");
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

    public List<Member> addNewMembers(){
        Boolean continueFlag = true;
        while (continueFlag) {
            memeberList.add(addNewMember());
            System.out.println( "Enter c to exit, press ENTER to continue for adding more members");
            if (scanner.nextLine().equalsIgnoreCase("c")) {
                continueFlag = false;
            }
        }

        return memeberList;
    }

    public Member findById() {
        displayMembers();
        System.out.println("Enter member ID to search");
        String memberId=scanner.nextLine();
        Boolean found=false;
        for(Member m: memeberList){
            if(m.getId().equals(memberId)){
                System.out.println("Member found");
                found=true;
            }
        }
        if(!found){
            System.out.println("Member NOT found");
        }
        return memeber;
    }

    public void displayMembers(){
        if(memeberList.isEmpty()){
            System.out.println("No member in the list");
        }
        for(Member m: memeberList){
            System.out.println("Member name: "+m.getName()+" | " + "Member ID: "+m.getId());
        }
    }

}
