import java.util.Scanner;
class BooksLib
{
	int bookid;
	String author;
	String title;
	boolean isavailable;
	
    Scanner sc=new Scanner(System.in);
	public static void main(String[]args)
	{
		
	
	    int count=0;
		boolean result=true;	Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ARRAY SIZE:");
		int size=sc.nextInt();
		
		BooksLib b[]=new BooksLib[size];
		b[count]=new BooksLib(0,"","",true);
		
		
		do{
	
		
		System.out.println("********************");
		System.out.println("BOOKS LIBRARY");
		System.out.println("1.ADD  A NEW BOOKS DETAILS");
		System.out.println("2.DISPLAY");
		System.out.println("3.BORROW");
		System.out.println("4.RETURN");
		System.out.println("5.EXIT");
		System.out.println("********************");
		System.out.println("ENTER YOUR OPTION");
		int option=sc.nextInt();
		if(option==1)
		{
		   BooksLib bs=new BooksLib(0,"","",true);
	        bs.add(b,count);
			count++;
		}
		else if(option==2)
		{
		
		   BooksLib bs=new BooksLib(0,"","",true);
			bs.display(b,count);
		}
		else if(option==3)
		{
			System.out.println("enter index");
			int i=sc.nextInt();
			if(i>=0&&i<count)
			{
			b[i].borrow();
			}
			else{
				System.out.println("INVALID SYNTAX");
			}
			
		}
		else if(option==4)
		{
			System.out.println("enter index");
			int i=sc.nextInt();
			if(i>=0&&i<count)
			{
			b[i].borrow();
			}
			else{
				System.out.println("INVALID SYNTAX");
			}
		
		}
		else 
		{
			result=false;
		}
		}while(result);
	
		
		
	}
	BooksLib(int bookid,String author,String title,boolean isavailable)
	{
		this.bookid=bookid;
		this.author=author;
		this.title=title;
		this.isavailable=isavailable;
	}
	 void add(BooksLib b[],int count)
	{
			
		
			System.out.println("ENTER THE BOOK ID");
			int id=sc.nextInt();
			System.out.println("ENTER THE BOOK NAME" );
			String name=sc.next();
			System.out.println("ENTER THE AUTHOR NAME");
			String authorname=sc.next();
			System.out.println("ENTER THE AVAILABILITY" );
			boolean available=sc.nextBoolean();
		    b[count]=new BooksLib(id,authorname,name,available);
		
	}
	 void display(BooksLib b[],int count)
   {
		for(int i=0;i<count;i++)
		{
			System.out.println( b[i].bookid);
			System.out.println(b[i].author);
			System.out.println(b[i].title);
			System.out.println(b[i].isavailable);
			
			
		}
	}
	void borrow()
	{
		if(isavailable==true)
		{
		 System.out.println("the book available");
		}
		else{
		System.out.println("the book is not available");
		}
	}
	void returnbook()
	{
		isavailable=true;
		System.out.println("the book is returned");
	}
	
}