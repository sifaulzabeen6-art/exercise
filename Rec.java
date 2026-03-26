class Rec
{
	public static void main(String[]args)
	{
		Rec r=new Rec();
		r.num(10);
	}
	void num(int i)
	{
		if(i>=1)
		{
			System.out.println(i);
			num(i-1);
		}
		
    }
}