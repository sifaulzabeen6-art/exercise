import java.util.Scanner;
class Home1
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the ARRAY SIZE");
		int size=sc.nextInt();
		int ar[]=new int[size];
		boolean result=true;
		do{
		System.out.println("**************");
		System.out.println("MENU");
		System.out.println("1.INSERT");
		System.out.println("2.DISPLAY");
		System.out.println("3.BINARY");
		System.out.println("4.LINEAR");
		System.out.println("5.exit");
		System.out.println("**************");
		System.out.print("ENTER THE OPTION:");
		int option=sc.nextInt();
		Home1 h=new Home1();
		if(option==1)
		{
			h.insert(ar);
		}
	   else if(option==2)
	     {
			 h.display(ar);
		 }
       else if(option==3)
	     {
			 System.out.print("ENTER THE TARGET VALUE:");
		    int val=sc.nextInt();
			int index=h.binary(ar,val);
			System.out.print(index);
		 }
       else if(option==4)
	     {
			 System.out.print("ENTER THE TARGET VALUE:");
		     int val=sc.nextInt();
			 int index=h.linear(ar,val);
			 System.out.print(index);
		 }
	 else
	 {
		result=false;
	 }
		}while(result);
		
		

		
	}
	void insert(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("ENTER THE ARRAY VALUE"+i+":");
			ar[i]=sc.nextInt();
		}
		
	}
	void display(int ar[])
	{
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	int binary(int ar[],int val)
	{
		int left=0;
		int right=ar.length-1;
		while(left<=right)
		{
		int mid=((left+right)/2);
		if (ar[mid]==val)
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
	int linear(int ar[],int val)
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