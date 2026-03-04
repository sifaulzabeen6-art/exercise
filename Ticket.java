class Ticket
{
	public static void main(String[]args)
	{
		int age=15;
		if(age<12)
		{
			System.out.println("ticket price $80");
		}
		else if((age>12)&&(age<59))
		{
			System.out.println("ticket price is $150");
		}
		else if(age>=60)
		{
			System.out.println("ticket price is $100");
		}
		else
		{
			System.out.println("free");
		}
		System.out.print("thank you");
	}
}