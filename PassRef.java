class PassRef
{
	int sum=0;
	public static void main(String[]args)
	{
		PassRef p2=new PassRef();
		int ar[]={12,34,56,78};
		p2.sum(ar);
		 ar[0]=25;
		for (int i=0;i<ar.length;i++)
		{
			
			System.out.println("After the value:"+ar[i]);
		}
		
		
		

	}
	void sum(int arr[])
	{
		
		for (int i=0;i<arr.length;i++)
		{
			
			System.out.println(arr[i]);
		}

	}
}