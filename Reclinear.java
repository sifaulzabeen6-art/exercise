import java.util.Scanner;
class Reclinear
{

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("ENTER THE ARRAY VALUE"+i+":");
			ar[i]=sc.nextInt();
		}
		
		System.out.println("ENTER THE TARGET VALUE:");
		int target=sc.nextInt();
		Reclinear r=new Reclinear();
		int result=r.linear(ar,0,target);
		System.out.println(result);
	}
	int linear(int ar[],int index,int target)
	{
		if(index>ar.length)
		{
			return -1;
		}
		if(ar[index]==target)
		{
			return index;
		}
		return linear(ar,index+1,target);
	}
}