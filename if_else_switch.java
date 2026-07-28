import java.util.*;

public class if_else_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Age : ");
        // int age = sc.nextInt();

        // Baalik - Nabalik
        // if(age < 18){
        //     System.out.println("Not Adult");
        // }
        // else{
        //     System.out.println("Adult");
        // }

        // Even - Odd :
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // if(n % 2 == 0){
        //     System.out.println("Even");
        // }else{
        //     System.out.println("Odd");
        // }

        // Number comparison :
        // int a, b;
        // System.out.println("Enter any 2 numbers : ");
        // a = sc.nextInt();
        // b = sc.nextInt();

        // // if(a == b) System.out.println("equal");
        // // if(a < b) System.out.println(a + " is smaller");
        // // if(a > b) System.out.println(a + " is greater");

        // // OR 
        // if(a==b) System.out.println("equal"); 
        // else if(a<b) System.out.println(b + " is greatest"); 
        // else System.out.println(a + " is greatest");

        // Negative Positive : 
        // System.out.println("Enter any number : ");
        // int c = sc.nextInt();
        
        // if(c < 0) System.out.println("negative");
        // else if (c > 0) System.out.println("positive");
        // else System.out.println("zero");
        
        // Nested Loops 

        // Largest Number :
        // int x, y, z;
        // x = sc.nextInt();
        // y = sc.nextInt();
        // z = sc.nextInt();

        // if(x < y){
        //     if(y<z){
        //         System.out.println(z+" is the largest number.");
        //     }else{
        //         System.out.println(y+" is the largest number.");
        //     }
        // }else{
        //     if(x<z){
        //         System.out.println(z+" is the largest number.");
        //     }else{
        //         System.out.println(x+" is the largest number.");
        //     }
        // }

        // Grade Calculator :
        // System.out.print("Enter your marks : ");
        // int marks = sc.nextInt();
        // if((marks > 90) && (marks <= 100)){
        //     System.out.println("A grade");
        // }else if((marks <= 90) && (marks > 75)){
        //     System.out.println("B grade");
        // }else if((marks <= 75) && (marks > 60)){
        //     System.out.println("C grade");
        // }else if ((marks <= 60) && (marks > 45)){
        //     System.out.println("D grade");
        // }else{
        //     System.out.println("F grade");
        // }

        // Leap Years :
        // System.out.println("Enter year : ");
        // int year = sc.nextInt();

        // if((year % 4 == 0) && (year % 100 == 0)){
        //     System.out.println("Leap year");
        // }else{
        //     System.out.println("Not a Leap year");
        // }

        // Switch cases
        System.out.print("Enter any case (1-3): ");
        int q = sc.nextInt();

        switch(q){
            case 1: System.out.println("Hello, Java User!");
            break;

            case 2: System.out.println("Namaste, Java User!");
            break;

            case 3: System.out.println("Bonjour, Java User!");
            break;

            default: System.out.println("Invalid User");
        }
    }
}
