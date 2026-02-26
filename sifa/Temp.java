class Temp
{
	public static void main(String [] args)
	{
		int a=50;
		int b=60;
		System.out.println("Before swapping");
        System.out.println("a:"+a);
		System.out.println("b:"+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}