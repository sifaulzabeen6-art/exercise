import java.util.Scanner;
class Binary
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for (int i=0;i<ar.length;i++)
		{
		System.out.println("ENTER THE ARRAY VALUE"+i+":");
		ar[i]=sc.nextInt();
		}
		System.out.print("ENTER THE TARGET VALUE:");
		int val=sc.nextInt();
		Binary b=new Binary();
		int result=b.bin(ar,val);
		System.out.println(result);
	}
	int bin(int ar[],int val)
	{
		int left=0;
		int right=ar.length-1;
		while(left<=right)
		{
			int mid=((left+right)/2);
			if(ar[mid]==val)
			{
				return mid;
			}
			else if(ar[mid]<val)
			{
				left=mid+1;
			}
			else 
			{
				right=mid-1;
			}
		}
		return-1;
	}
}