import java.util.Scanner;
class Linear
{
	public static void main(String[]args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE SIZE");
		int size= sc.nextInt();
		int ar[]=new int[size];
		for (int i=0;i<ar.length;i++)
		{
		System.out.println("ENTER THE ARRAY VALUE"+i+":");
		ar[i]=sc.nextInt();
		}
		System.out.print("ENTER THE TARGET VALUE:");
		int val=sc.nextInt();
		Linear l1=new Linear();
		int result=l1.search(ar,val);
		System.out.print(result);
	}
	int search(int ar[], int val)
	{
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==val)
			{
				return i;
			}
		}
		return -1;
	}
}