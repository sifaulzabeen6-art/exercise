class Student1
{
	String name;
	int age;
	int salary;
	 void  hello()
	 {
		 System.out.println("welcome to the java world");
	 }
	 public static void main(String[]args)
	 {
		 Student1 s1=new Student1();
		 s1.name="sifa";
		 s1.age=19;
		 s1.salary=2000;
		 s1.hello();
		 System.out.println(s1.name);
		 System.out.println(s1.age);
		 System.out.println(s1.salary);
		 Student1 s2=new Student1();
		 s2.name="sulaimaan";
		 s2.age=25;
		 s2.salary=200000;
		 s1.hello();
		 System.out.println(s2.name);
		 System.out.println(s2.age);
		 System.out.println(s2.salary);
		  
		  
		  
		  
		  
	 }
}