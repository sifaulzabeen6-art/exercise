class PassValue
{
	public static void main(String[]args)
	{
		PassValue p1=new PassValue();
		int a=5;
		
		p1.sum(a);
        a=20;
	    System.out.println("aftrer the value"+a);
		
	}
	void sum(int a)
	{
		
		System.out.println("Before the value"+a);
		
	}
}