import java.util.Scanner;
class Array4
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ROW SIZE");
	    int row=sc.nextInt();
		System.out.print("ENTER THE COLUMN SIZE");
	    int column=sc.nextInt();
		
		char arr[][]=new char [row][column];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("ENTER THE  "+i+j+"VALUE :");
				 arr[i][j]=sc.next().charAt(0);
				 
			}
			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+"");
			}
			System.out.println("");
		}
			
	}
}