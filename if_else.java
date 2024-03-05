




// //check if number is positive, negative or zero
// public class if_else {

    
//         static void checkNumber(int num){
         
//             if(num>0)
//                 System.out.println(num + " is POSITIVE NUMBER.");
//             else if(num<0)
//                 System.out.println(num + " is NEGATIVE NUMBER.");
//             else
//                 System.out.println(num + " is a ZERO.");
//         }
//         public static void main( String args[] ) {
//             // create some number values
//             int no1 = -2;
//             int no2 = 0;
//             int no3 = -100;
//             int no4 = 4 * -1;
    
//             // invoke function
//             checkNumber(no1);
//             checkNumber(no2);
//             checkNumber(no3);
//             checkNumber(no4);
//         }
//     }


// write a program to display  to prime number  an odd number by using  java 


import java.util.Scanner;

public class if_else {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);/// creating bi-directional communication between the software and its user.

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
    }
}
    
