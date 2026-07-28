import java.util.*;

public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();
        System.out.print("Enter Roll No. : ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter branch name : ");
        String branch = sc.nextLine();
        System.out.println("\n");
        System.out.println("Your Input : ");
        System.out.println("Name : "+name+"\nRoll No : "+roll+"\nBranch : "+branch);
        
    }
}
