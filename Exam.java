import java.util.Scanner;
class Exam
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the starting num:");
		int a=sc.nextInt();
		System.out.print("enter the last num:");
		int b=sc.nextInt();
		int evencount=0;
		int oddcount=0;
		int evensum=0;
		int oddsum=0;
		//System.out.print("even num:");
		
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"");
				evencount++;
				evensum+=i;
			}
			//System.out.println();
			//System.out.println("odd number:");
			
		
			else
			{ 
				//System.out.println(i+"");
				oddcount++;
				oddsum+=i;
			}
		}
			
			System.out.println("EVEN COUNT:"+evencount);
			System.out.println("ODD COUNT:"+oddcount);
			System.out.println("EVEN SUM:"+evensum);
			System.out.println("ODD SUM:"+oddsum);
			
		
		
	}
}