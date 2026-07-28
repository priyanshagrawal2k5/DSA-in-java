import java.util.*;

public class Practise1 {

    // Ques 01:
    public static void avg(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println("Average of this nuumber is "+avg);
        return;
    }

    // Ques 02:
    public static void sum(int x){
        int sum = 0;
        for(int i=0; i<x; i++){
            if(i % 2 != 0){
                sum = sum+i;
            }
        }
        System.out.println("Sum of all odd number till "+x+" is "+sum);
        return;
    }

    // Ques 03:
    public static void max(int a, int b){
        if(a>b) System.out.println(a+" is greater.");
        else System.out.println(b+" is greater.");
        return;
    }

    // Ques 04:
    public static void cir(int r) {
        double cir = 3.14 * r * r;
        System.out.println("Circumference of Circle is "+cir);
        return;
    }

    // Ques 05:


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Ques 01 :
        // System.out.println("Enter any 3 numbers : ");
        // int a = sc.nextInt(); sc.nextLine();
        // int b = sc.nextInt(); sc.nextLine();
        // int c = sc.nextInt(); sc.nextLine();
        // avg(a,b,c);

        // Ques 02 :
        // System.out.println("Enter any numbers : ");
        // int a = sc.nextInt();
        // sum(a);

        // Ques 03 :
        // System.out.println("Enter any 3 numbers : ");
        // int a = sc.nextInt(); sc.nextLine();
        // int b = sc.nextInt(); sc.nextLine();
        // max(a, b);

        // Ques 04 :
        // System.out.println("Enter any numbers : ");
        // int a = sc.nextInt();
        // cir(a);

        // Prime Number :
        // System.out.println("Enter any numbers : ");
        // int a = sc.nextInt();
        // if(a<=1) System.out.println("Not a prime number.");
        // else{
        //     for(int i=2; i<a; i++){
        //         if(a % i==0){
        //             System.out.println("Not a prime number");
        //             break;
        //         }else{
        //             System.out.println("Prime number");
        //         }
        //     }
        // }
        int d = 1;
        int sum = 0; 
        int i = 1, count = 0;
        while(i<=50){
            if(i % 10 == d){
                sum = sum + i;
                System.out.println(i);
                i++;
            }
        }
        System.out.println(sum);
    }
}

