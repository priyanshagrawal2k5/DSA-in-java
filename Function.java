import java.util.*;

public class Function{

    // Function 1 :
    public static void name(String a){
        System.out.println("Your name is : "+a);
        return;
    }

    // Function 2 :
    public static void sum(int x, int y){
        int sum = x + y;
        System.out.println("Sum of this two input is "+ sum);
        return ;
    }

    // Function 3 :
    public static void fact(int x){
        if(x<0){
            System.out.println("Factorial cannot be calculated."); 
            return;
        }else{
            int fact = 1;
            for(int i=1; i<=x; i++){
                fact = fact*i;
            }
            System.out.println("Factorial is "+fact);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Function for Printing Name :
        // System.out.print("Enter your name : ");
        // String name = sc.nextLine();
        // name(name); 

        // Function for sum :
        // System.out.println("Enter any 2 number : ");
        // int a = sc.nextInt();sc.nextLine();
        // int b = sc.nextInt();sc.nextLine();
        // sum(a, b); 

        // Function for factorial :
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        fact(x);

    }
}