import java.util.Scanner;
class Array3
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sci=new Scanner(System.in);
		System.out.print("ENTER THE ROW SIZE");
	    int row=sc.nextInt();
		System.out.print("ENTER THE COLUMN SIZE");
	    int column=sc.nextInt();
		
		String arr[][]=new String [row][column];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print("ENTER THE  "+i+j+"VALUE :");
				 arr[i][j]=sci.nextLine();
				 
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