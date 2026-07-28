import java.util.*;

public class I_O {
    public static void main(String[] args) {

        //Output :
        System.out.print("Hello World");
        System.out.print("Hello World\n");
        System.out.println("Hello World");

        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

        // variables 
        int a = 10;
        int b = 20;
        String name = "Priyansh";

        double c = a * b;
        name = "munnu";

        System.out.println("Name : " + name + " brought " + c + "rupees");

        //___________________________________________________________________________________
        // Input : 
        // import java.util.*; (at the top)

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Full Name : ");
        name = sc.nextLine();
        System.out.println("User Name is " + name);
        // we use sc.next() to fetch single token 
        // shyd se hum sc.next() use krne k baad hume buffer use krna pdta hai to prevent the code to throw error due to that extra values or data
        System.out.println("Enter age : ");
        int age = sc.nextInt(); 
        System.out.println("Age is " + age);


        // Daily tasks :
        // 01. 
        System.out.println("Priyansh Agrawal");
        System.out.println("Ramdeobaba University");
        
        //02,3,4. 
        System.out.print("Enter name :");
        name = sc.nextLine();
        System.out.println("Name is  " + name);
        System.out.print("Enter age :");
        age = sc.nextInt();
        System.out.println("Age is  " + age);
        int m1, m2, m3;
        System.out.print("Enter 3 marks : ");
        m1 = sc.nextInt();
        m2 = sc.nextInt();
        m3 = sc.nextInt();
        int total = m1 + m2 + m3;
        System.out.println("Total sum is " + total);

    }
}