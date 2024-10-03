// import java.util.*;

// public class day03 {

//     public static void main(String args []){
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int numbers [][] = new int[rows][cols];

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 numbers[i][j]=sc.nextInt();
//             }
//         }

//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 System.out.print(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }


import java.util.*;

class Array2D{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int Array [][] = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                Array[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }

        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(Array[i][j] == x){
                    System.out.println("Indices of the given number is " + i + "*" + j);
                }
            }
        }
    }
}