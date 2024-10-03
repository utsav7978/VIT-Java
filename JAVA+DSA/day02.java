// import java.util.*;

// class arrays{
//     public static void main(String args []){
//         // int marks[] = new int[3];
//         // marks[0] = 97;
//         // marks[1] = 95;
//         // marks[2] = 98;
//         // int marks[] = {97, 95, 98};

//         // // System.out.println(marks[0]);
//         // // System.out.println(marks[1]);
//         // // System.out.println(marks[2]);

//         // for(int i=0; i<3; i++){
//         //     System.out.println(marks[i]);
//         // }

//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();

//         int numbers[] = new int[size];

//         for(int i=0; i<size; i++){
//             numbers[i] = sc.nextInt();
//         }

//         for(int i=0; i<size; i++){
//             System.out.println(numbers[i]);
//         }
//     }
// }

import java.util.*;

class arrays{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<size; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("Enter the number whose index you need to find: ");
        int x = sc.nextInt();

        for(int i=0; i<numbers.length; i++){   //we can use size as well instead of numbers.length
            if(numbers[i] == x){
                System.out.println("Index of the number " + x + " is " + i);
            }
        }
    }
}