class RecEven
{
	public static void main(String[]args)
	{
		RecEven n=new RecEven();
		n.num(1);
	} 
	void num(int i)
	{
		if(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
			}
		num(i+1);
		}
		
		
		
	}
	
	
}