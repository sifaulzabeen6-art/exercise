class Pat2
{
	public static void main(String[]args)
	{
		
		for(int i=1;i<=5;i++)
		{
				char let='A';
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(let);
				let++;
			}
			System.out.println("");
		}
	}
}