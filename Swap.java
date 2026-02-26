class Swap
{
	public static void main(String [] args)
	{
		int a=70;
		int b=100;
		System.out.println("Before swapping");
        System.out.println("a:"+a);
		System.out.println("b:"+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping");
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}