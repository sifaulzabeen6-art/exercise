class CopyConstructor
{
	int age;
	String name;
	CopyConstructor(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	 void display()
	{
		System.out.println("My age is:"+age);
		System.out.println("My name is:"+name);
		
		
	}
		CopyConstructor(CopyConstructor cc)
		{
			this.age=cc.age;
			this.name=cc.name;
	
		
		}
	public static void main(String[]args)
	{
		CopyConstructor c=new CopyConstructor(21,"sifa"); 
		 
		CopyConstructor c1=new CopyConstructor(c);
		c.display();
	    c1.display();
		
	}
	
	
}