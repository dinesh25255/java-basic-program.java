public class student {

    public static void main(String[] args) {
        student stud = new student();

        stud.forLoopShow();
        stud.showWhileLoop();
        stud.showarray();
    }

    public void forLoopShow(){
        for( int i=0;i<5;i++){
            System.out.println(i);
        }
    }

   public void showWhileLoop(){
    int i=0;
    while(i<5);{
        System.out.println(i);
        i++;

    }


}

public void showarray(){
    String firstName = "John ";
    String lastName = "Doe";
    int age=2;
    String fullName = firstName + lastName +age;
    System.out.println(fullName);


}
  
    
}
