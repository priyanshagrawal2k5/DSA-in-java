import java.util.*;

class loops{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // FOR LOOP : 

        // print 1-100
        // for(int i=1; i<=100; i++){
        //     System.out.println(i);
        // }

        // print even numbers 
        // for (int i=1; i<=10; i++){
        //     if(i % 2 == 0) System.out.println(i);
        // }

        // print odd numbers 
        // for(int i=1; i<=10; i++){
        //     if(i % 2 != 0) System.out.println(i);
        // }

        // Sum 1 to N
        // System.out.print("Enter value for N : ");
        // int N = sc.nextInt();
        // sc.nextLine();
        // int sum = 0;
        // for(int i=0; i<=N; i++){
        //     sum += i;
        // }
        // System.out.println("Sum is "+sum);

        // Multiplication Table
        // System.out.print("Table of : ");
        // int n = sc.nextInt();
        // sc.nextLine();
        // for(int i=1; i<=10; i++){
        //     System.out.println(n+" x "+i+" = "+n*i);
        // }

        // Factorial
        // int fact = 1;
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     fact = fact * i;
        // }
        // System.out.println("Factorial of "+n+" is "+fact);

        //__________________________________________________________________________________________________________
        // WHILE LOOP : 
        // int i = 1;
        // while (i <= 10) { 
        //     System.out.println(i);
        //     i += 1;
        // }

        // Reverse Number : 
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // int rev = 0;
        // while(n != 0){
        //     int digit = n % 10;
        //     rev = rev*10 + digit;
        //     n = n / 10;
        // }
        // System.out.println("Reverse number is " + rev);

        // Count digits :
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // int count = 0;
        // while(n != 0){
        //     n = n/10;
        //     count++;
        // }
        // System.out.println("Total digits are "+count);

        // Sum digits :
        // System.out.print("Enter any number : ");
        // int n = sc.nextInt();
        // int sum = 0;
        // while(n != 0){
        //     int i = n % 10;
        //     sum = sum + i;
        //     n = n/10;
        // }
        // System.out.println("Sum of the digits is "+sum);

        //__________________________________________________________________________________________________________
        // DO - WHILE LOOP : 
        // Menu Program :
        // int i = 0;
        // do { 
        //     System.out.println("Menu Driven Program : ");
        //     System.out.println("1. Sum\n2. Difference\n3. Product\n4. Division\n5. Exit");
        //     System.out.print("Choose your choice : ");
        //     i = sc.nextInt();
        //     switch (i) {
        //         case 1:System.out.println("\nYou choose to Sum of two numbers : \nEnter the values for :");
        //             System.out.print("a : ");
        //             int a = sc.nextInt();
        //             sc.nextLine();
        //             System.out.print("b : ");
        //             int b = sc.nextInt();
        //             sc.nextLine();
        //             int sum = a+b;
        //             System.out.println("Sum is "+sum+"\n");
        //             break;

        //         case 2:System.out.println("\nYou choose to Difference of two numbers : \nEnter the values for :");
        //             System.out.print("a : ");
        //             a = sc.nextInt();
        //             sc.nextLine();
        //             System.out.print("b : ");
        //             b = sc.nextInt();
        //             sc.nextLine();
        //             int diff = a-b;
        //             System.out.println("Difference is "+diff+"\n");
        //             break;
                    
        //         case 3: System.out.println("\nYou choose to Product of two numbers : \nEnter the values for :");
        //             System.out.print("a : ");
        //             a = sc.nextInt();
        //             sc.nextLine();
        //             System.out.print("b : ");
        //             b = sc.nextInt();
        //             sc.nextLine();
        //             int prod = a*b;
        //             System.out.println("Product is "+prod+"\n");
        //             break;

        //         case 4: System.out.println("\nYou choose to Division of two numbers : \nEnter the values for :");
        //             System.out.print("a : ");
        //             a = sc.nextInt();
        //             sc.nextLine();
        //             System.out.print("b : ");
        //             b = sc.nextInt();
        //             sc.nextLine();
        //             double divide = (double) a/b;
        //             System.out.println("Divison is "+divide+"\n");
        //             break;

        //         default:
        //             System.out.println("Invalid choice\nExiting the program....");
        //             i = 5;
        //     }
        // } while (i != 5);

        // print sum of first 4 natural no.s
        int sum = 0;
        for(int i = 1; i<=4; i++){
            sum = sum + i;
            if(i == 4) System.out.println(i);
            else System.out.print(i+" + ");
        }
        System.out.println("Sum : "+sum);

    } 
}