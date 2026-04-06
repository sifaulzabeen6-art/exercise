package abstraction;

public class Sifa extends Student{

    @Override
    void feedback() {
        System.out.println("very nice");
}
    
     

    @Override
    int marks() {
      return 100;
    }
    Sifa(){
         System.out.println("all are good student");
}

    
}
