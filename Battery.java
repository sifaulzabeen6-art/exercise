class Battery
{

	
	public static void main(String[]args)
	{
		int charge=45;
		if(charge>=80)
		{
			System.out.println("battery full");
		}
		else if((charge>30)&&(charge<79))
		{
			System.out.println("battery normal");
		}
		else if(charge<30)
		{
			System.out.println("low battery");
		}
		else
		{
			System.out.println("connect charger");
		}
		System.out.println("current charge:"+charge);
	}
}