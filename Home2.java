import java.util.Scanner;
class Home2
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		int ar[]=new int[size];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("ENTER THE ARRAY  VALUE OF"+i);
			ar[i]=sc.nextInt();
		}
		boolean result=true;
		Home2 h=new Home2();
		
		do
		{
		System.out.println("1.SWAP");
		System.out.println("2.MAXIMUM");
		System.out.println("3.REVERSE");
		System.out.println("4.SORTING");
		System.out.println("5.SEARCHING");
		System.out.println("6.EXIT");
		System.out.print("ENTER THE OPTION:");
		int op=sc.nextInt();
		if(op==1)
		{
		h.swap(ar,2,1);	
		}
		else if(op==2)
		{
			h.maxi(ar);
		}
		else if(op==3)
		{
		h.reverse(ar);
		}
		else if(op==4)
		{
		h.sort(ar);	
		}
		else if(op==5)
		{
			System.out.println("ENTER THE TARGET VALUE:");
		    int target=sc.nextInt();
			h.search(ar,target,0);
		}
	    else{
			result=false;
			}
	
	}while(result);
}
	void swap(int arr[],int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
			for (int i=0;i<arr.length;i++)
			{
			System.out.println("dispaly the  array value swaped:"+arr[i]);
			}
	}
	void maxi(int arr[])
	{
		int max=0;
		
		for(int i=0;i<arr.length;i++)
	    {
			if(arr[i]>max)
			{
			
				max=arr[i];
			}			
         
		}
		System.out.println("ENTER THE MAXIMUM VALUE"+max);
	}
	void reverse(int arr[])
	{
		
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(  "Reverse the array:"+arr[i]);
		}
	}
	void sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
				for(int j=0;j<arr.length-1-i;j++)
				{
					if(arr[j]>arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print( "SORTED ARRAY:"+arr[i]+" ");
		}
	}
	void search(int ar[],int target,int index)
	{
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]==target)
		{
				System.out.println(i);
			}
		}
	}

	

}