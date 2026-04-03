package constructor;

public class AllConstructor {
  int a;
  int b;
    AllConstructor()
    {
        System.out.println("ASSSALAMUALIKUM");
    }
      AllConstructor(int a,int b)
      {
          this.a=a;
          this.b=b;
          System.out.println(a+b);
      }
       AllConstructor(AllConstructor aa)
       {
           this.a=aa.a;
           this.b=aa.b;
           
       }
    
}
