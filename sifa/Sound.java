import java.util.Scanner;
class Sound
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the sound animal:");
String name=sc.nextLine();
switch(name)
{
	case "dog":
	{
		System.out.println("barking");
		break;
	}
	case "cat":
	{
		System.out.println("meow");
		break;
	}
	case "cow":
	{
		System.out.println("cow say moo:");
		break;
	}
}
System.out.println("nandri");


}
}