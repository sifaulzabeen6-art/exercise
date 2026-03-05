import java.util.Scanner;

class Scan
{
		public static void main(String[]args)
		{
			Scanner ab=new Scanner(System.in);//string
			Scanner cd=new Scanner(System.in);//num
			System.out.print("Enter a name:");
			String name=ab.nextLine();
			System.out.print("Enter a age:");
			byte age=cd.nextByte();
			System.out.print("Enter a initial");
			char initial=ab.next().charAt(0);
			
			System.out.println(name);
			System.out.println(age);
			System.out.println(initial);
		}
		
		
		
}
