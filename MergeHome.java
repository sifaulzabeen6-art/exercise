import java.util.Arrays;
import java.util.Scanner;
class MergeHome

{
	Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		boolean result=true;
		int arrr[]=null;
		do{
		
		System.out.println("1.ENTER THE ARRAY");
		System.out.println("2.MERGE ASCENDING");
		System.out.println("3.MERGE DESCENDING");
		System.out.println("4.FIND MEDIAN");
		System.out.println("5.DISPLAY ARRAY");
		System.out.println("6.EXIT");
		System.out.println("CHOOSE THE OPTION:");
		int option=sc.nextInt();
		
		
		 MergeHome mh=new MergeHome();
		if(option==1)
		{
		System.out.println("ENTER ARRAY SIZE:");
		int size=sc.nextInt();
		arrr=new int[size];
		mh.enter(arrr);
		}
	   else if(option==2)
	    {
			 arrr= mh.ascending(arrr);
			 mh.display(arrr);
		}
       else if(option==3)
       {
		  arrr= mh.descending(arrr);
		  mh.display(arrr);
	   }
       else if(option==4)
	   {
		  double res=mh.median(arrr);
		  System.out.println(res);
		  
	   }
       else if(option==5)
       {
		   mh.display(arrr);
	   }
      else
       {
		   result=false;
		}
	}while(result);
    
	 
	}
	
	
	
	void enter(int arr[])
	{
	for(int i=0;i<arr.length;i++)
	{
		System.out.println("ENTER THE ARRAY VALUE OF"+i+":");
		arr[i]=sc.nextInt();
	}
	}
	int []divide(int arr[]){
		if(arr.length==1)
		{
			return arr;
		}
		int mid=arr.length/2;
		int left[]=divide(Arrays.copyOfRange(arr,0,mid));
		int right[]=divide(Arrays.copyOfRange(arr,mid,arr.length));
		return conquere(left,right);
		}
		int[] conquere(int left[],int right[])
		{
			int i=0;
			int j=0;
			int k=0;
			int ar[]=new int[left.length+right.length];
			while(i<left.length&&j<right.length)
			{
				if(left[i]<right[j])
				{
					ar[k]=left[i];
					i++;
					k++;
				}
				else
				{
					ar[k]=right[j];
					j++;
					k++;
				}
				
			}
			while(i<left.length)
			{
				ar[k]=left[i];
				i++;
				k++;	
			}
			while(j<right.length)
			{
				ar[k]=right[j];
				j++;
				k++;	
			}
			return ar;
		}
    int[] ascending(int arr[])
	{
		return divide(arr);
	}	
	int[] descending(int arr[])
	{
	 arr=divide(arr);
	 for(int i=0;i<arr.length/2;i++)
	 {
		 int temp=arr[i];
		 arr[i]=arr[arr.length-1-i];
		 arr[arr.length-1-i]=temp;
		 
	 }
	 return arr;
	}
	double median(int ar[])
	{
		ar=divide(ar);
		int midv=ar.length/2;
		if(ar.length%2==0)
		{
			return ((ar[midv]+ar[midv-1])/2.0);
		}
		else{
			return ar[midv];
		}
		
	}
	void display(int arr[])
	{
		for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	}
}
