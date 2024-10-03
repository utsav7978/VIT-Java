import java.util.Scanner;
class main_98{
    // public static void main(String [] args){
    //     for(int num=1; num<=5; num++){
    //         System.out.println(num);
    //     }
    // }
    // public static void main(String [] args){
    //     Scanner input = new Scanner(System.in);
    //     int num = input.nextInt();
    //     for(int i = 1; i<=num; i+=1 ){
    //         System.out.print(i + " ");
    //     }
    // }
    // public static void main(String [] args){
    //     Scanner i = new Scanner(System.in);
    //     int input = i.nextInt();
    //     int num = 1;
    //     while(num<=input){
    //         System.out.println(num);
    //         num++;
    //     }
    // }

    // public static void main(String args[]){
    //     Scanner i = new Scanner(System.in);
    //     int input = i.nextInt();
    //     int u = 1;
    //     do{
    //         System.out.print(u+" ");
    //         u+=1;
    //     } while(u<=input);
    // }

    // public static void main(String args []){
    //     Scanner sc = new Scanner(System.in);
    //     int salary = sc.nextInt();
    //     if(salary>=10000){
    //         salary = salary+2000;
    //     } else{
    //         salary = salary+1000;
    //     }System.out.println(salary);
    // }


    // Find the largest number.
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
        
//         int max = a;
//         if(b>max){
//             max=b;
//         }
//         if(c> max){
//             max=c;
//         }
//         System.out.println(max);
//     }
// }

    // public static void main(String args[]){
    //     Scanner sc = new Scanner(System.in);
    //     // int a = sc.nextInt();
    //     // int b = sc.nextInt();

    //     int button = sc.nextInt();

    //     switch(button){
    //         case 1: System.out.println("Hello");
    //         break;
            
    //         case 2: System.out.println("Namaste");
    //         break;

    //         case 3: System.out.println("Bonjour");
    //         break;

    //         default: System.out.println("Invalid button");
    //     }

    //     // if(a==b){
    //     //     System.out.println("equal");
    //     // } else if(a>b){
    //     //     System.out.println("a is greater than b");
    //     // } else{
    //     //     System.out.println("b is greater than a");
    //     // }
    // }

    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // int sum = 0;
        for(int i=1; i<=10; i++){
            System.out.println(i*n);
        } //System.out.println(sum);
    }
}