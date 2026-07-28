public class Pattern {
    public static void main(String[] args) {
        // Rectangle
        // for(int i=0; i<4; i++){
        //     for(int j=0; j<5; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // Hollow Rectangle
        // for(int i=0; i<4; i++){
        //     for(int j=0; j<5; j++){
        //         if((i == 0) || (i == 3)){
        //             System.out.print(" * ");
        //         } else{
        //             if((j==0) || (j==4)) System.out.print(" * ");
        //             else System.out.print("   ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Left Pyramid : 
        // for(int i=0; i<5; i++){
        //     for(int j = 0; j<i+1; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // Inverted Pyramid :
        // for(int i=5; i>0; i--){
        //     for(int j=i; j>0; j--){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // Right Pyramid : 
        // for(int i=0; i<5; i++){
        //     //spaces
        //     for(int k=4-i; k>0; k--){
        //         System.out.print("   ");
        //     }
        //     //stars
        //     for(int j=0; j<i+1; j++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // Left Pyramid with Numbers :
        // for(int i=0; i<5; i++){
        //     for(int j=1; j<i+2; j++){
        //         System.out.print(" "+j+" ");
        //     }
        //     System.out.println();
        // }

        // Inverted Pyramid with Numbers :
        // for(int i=0; i<5; i++){
        //     for(int j=1; j< 5-i; j++){
        //         System.out.print(" "+j+" ");
        //     }
        //     System.out.println();
        // }

        // Floyd's Triangle : 
        // int k=1;
        // for(int i=0; i<5; i++){
        //     for(int j=0; j<i+1; j++){
        //         System.out.print(" "+k+" ");
        //         k++;
        //     }
        //     System.out.println();
        // }

        // 0-1 Triangle : 
        // for(int i=0; i<5; i++){
        //     for(int j=0; j<i+1; j++){
        //         if((i+j) % 2 == 0) System.out.print(" 1 ");
        //         else System.out.print(" 0 ");
        //     }
        //     System.out.println();
        // }
        

    }
}
