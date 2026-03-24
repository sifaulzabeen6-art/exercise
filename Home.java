import java.util.Scanner;
class Home
{
	Scanner sc=new Scanner(System.in);

    
	public static void main(String[]args)
	{
		
	   Scanner sc=new Scanner(System.in);
		System.out.print("ENTER THE ARRAY SIZE");
	     int size=sc.nextInt();
	     int ar[]=new int[size];
			boolean result=true;
		
			
		for (int i=0;i<ar.length;i++)
		{
			System.out.println("ENTER THE EMPLOYEE ID:");
			ar[i]=sc.nextInt();
		}
		Home h1=new Home();
		do{
		System.out.println("***********");
		System.out.println("MENU");
		System.out.println("1.ADD EMPLOYEE ID");
		System.out.println("2.REMOVE EMPLOYEE ID");
		System.out.println("3.DISPLAY EMPLOYEE ID");
		System.out.println("4.EXIT");
		System.out.println("*****************");

	System.out.println("ENTER YOUR CHOICE:");
	int choice=sc.nextInt();
	
	
	if(choice==1)
	{
	 ar=h1.add(ar);	
	}
	else if(choice==2)
	{
		 ar= h1.remove(ar);
	}
	else if(choice==3)
	{
		h1.display(ar);
	}
	else 
	{
		result=false;
	}
  }while(result);
		
	
    
	
	
	}
	
	
	int[] add(int ar[])
	{
	
		Scanner se=new Scanner(System.in);
		System.out.print("ENTER THE VALUE TO insert position");
		int num=se.nextInt();
		System.out.println("ENTER THE VALUE TO ADD:");
		int e=sc.nextInt();
		
		int arr[]=new int[ar.length+1];
		for(int i=0;i<num-1;i++)
		{
			arr[i]=ar[i];
			
		}
	
		arr[num-1]=e;
		for(int i=num;i<arr.length;i++)
		{
			arr[i]=ar[i-1];
		}
	    for(int i=0;i<arr.length;i++)
		{
			System.out.println( "AFTER"+arr[i]);
		}
		return arr;
	}
		
		
	

	int[] remove(int ar[])
	{
		Scanner se=new Scanner(System.in);
		System.out.print("ENTER THE VALUE TO DELETE POSITION");
		int num=se.nextInt();
		
		
	
		
		int arr[]=new int[ar.length-1];
		for(int i=0;i<num-1;i++)
		{
			arr[i]=ar[i];
			
		}
		
		for(int i=num-1;i<arr.length;i++)
		{
			arr[i]=ar[i+1];
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(  "AFTER  THE DELETED EMPLOYEE: "+arr[i]);
		}
		return arr;
	}
	void display(int arr[])
	{
		
		for(int i=0;i<arr.length;i++)
		{
			
			System.out.println("DISPLAY THE EMPLOYEE ID :"+arr[i]);
			
		}
		
	
			
		
	}
}