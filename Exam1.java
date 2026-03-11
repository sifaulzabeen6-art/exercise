import java.util.Scanner;
class Exam1
{
	public static void main(String[]args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("enter the starting number:");
		int start=sc.nextInt();
		System.out.print("enter the ending number:");
		int end=sc.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}