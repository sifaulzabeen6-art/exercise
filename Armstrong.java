class Armstrong
{
	public static void main(String[]args)
	{
		int a=153;
		int b=a%10;
		int c=a/10;
		int d=c%10;
		int e=c/10;
		int f=((b*b*b)+(d*d*d)+(e*e*e));
		boolean result=a==f;
		System.out.println("the answer is arm"+result);
	}
		
}