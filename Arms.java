import java.util.Scanner;

	class Arms
	{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("ENTER A NUM:");
			int a=sc.nextInt();
			int temp=0;
			int rev=0;
			int sum=0;
			while(a>0)
			{
				rev=a%10;
				sum=(rev*rev*rev)+sum;
				a=a/10;
			}
			if(temp==sum)
			{
					System.out.print(sum+"ARMSTEONG");
			}
			else
			{
					System.out.print(sum+" not ARMSTEONG");
			}
			
		}
	}
