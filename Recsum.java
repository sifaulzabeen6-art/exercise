class Recsum
{
	public static void main(String[]args)
{
	Recsum r=new Recsum();
	 int result=r.sum(1);
	 System.out.println(result);
}
int sum(int i)
{
	int sum=0;
	if(i==10)
	{
	 return -1;
	}
	sum=sum+i;
	System.out.println(sum);
	 return sum(i+1);
}
}