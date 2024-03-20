import java.util .*;

// // write to read a number  and display  its half//

// public class NumDisplay {

//     public static void  main(String [] args){

//         int  num =10;
//     System.out.println("The given number is"+ num);
//     System.out.println("half number is " + num/2);

//     }
    
// }


public class NumDisplay{

    public static void main(String [] args){

        System.out.println("Enter the number ");
        Scanner sc = new Scanner(System.in);

        int num = sc .nextInt();
        int half = num/2;


        System.out.println("The half number is " + half);

    }

}
