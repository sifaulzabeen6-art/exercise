class Constructor
{
	Constructor()
	{
		System.out.println("HI  I AM A GIRL");
		
	}
	Constructor(String name)
	{
		System.out.println("MY NAME IS:"+name);
	}
	Constructor(String name,int age)
	{
		System.out.println("MY SISTER NAME IS:"+name);
		System.out.println("MY AGE IS:"+age);
	}
	public static void main(String[]args)
	{
		Constructor c=new Constructor();
		Constructor c1=new Constructor("sifa");
		Constructor c2=new Constructor("sana",21);
	}
	
}