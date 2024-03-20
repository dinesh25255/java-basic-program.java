 
import java.util.*;

 // Wap to read a number and dispaly its square



public class NumSquare {


    public static void Main (){

        System.out.println("Enter The any number");

        Scanner  sc = new Scanner(System.in);

        int Num = sc.nextInt();

        int squ = Num*Num;

        System.out.println("The square  of the number is " + squ);

        sc.close();

    }
    
}
