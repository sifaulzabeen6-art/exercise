import java.util.Scanner;
class Recbinary
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
		int left=0;
		int right=ar.length-1;
		System.out.println("ENTER THE TARGET VALUE:");
		int target=sc.nextInt();
		Recbinary r=new Recbinary();
		 int result=r.binary(ar,left,right,target);
		 System.out.println(result);
	}
	int binary(int ar[],int left,int right,int target)
	{
		if(left>=right)
		{
			return -1;
		}
		int mid=((left+right)/2);
		if(ar[mid]==target)
		{
			return mid;
		}
		if(target<ar[mid])
		{
			return binary(ar,left,mid-1,target);
		}
		return binary(ar,mid+1,right,target);
	}
}