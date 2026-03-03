class Neon
{
	public static void main(String[]args)
	{
		int a=13;
		int b=a*a;
		int c=b%10;
		int d=b/10;
		int e=d%10;
		int f=d/10;
		int g=(c+e+f);
		boolean result=a==g;
		System.out.println("the ans in neon"+result);
		
	}
}