import java.util.Scanner;
class Exam2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("ENTER FIRST NUMBER:");
		int fir=sc.nextInt();
		System.out.print("ENTER SECOND NUMBER:");
		int sec=sc.nextInt();
		System.out.print("ENTER THIRD NUMBER:");
		int thir=sc.nextInt();
		boolean result=true;
		do{
		System.out.println("*************WELCOME*****");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.MULTIPLICATION");
		System.out.println("4.EXIT");
		System.out.println("*********************");
		System.out.print("ENTHE THE OPTION:");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("ADDITIOIN:"+(fir+sec+thir));
		}
		else if(option==2)
			{
			System.out.println("SUBTRACTION:"+(fir-sec-thir));
		}
		else if(option==3)
		{
			System.out.println("MULTIPLICATION:"+(fir*sec*thir));
			
		}
		else{
			System.out.println("THE PROGRAM EXITED");
			result=false;
		}
	}while(result);
	
			
		
	}
}