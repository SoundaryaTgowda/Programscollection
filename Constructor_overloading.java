package javaclass;

public class Constructor_overloading 
{
	Constructor_overloading(String name)
	{
		
		{
			System.out.println("Print constructor1");
		}
	}
	
	Constructor_overloading(int age)
	{
		
		{
			System.out.println("Print Constructor2");
		}
	}
	Constructor_overloading(char grade)
	{
		
		{
			System.out.println("Print Consturctor3");
		}
	}
	public static void main(String[] args) 
	{
		new Constructor_overloading("Ram");
		new Constructor_overloading(35);
		new Constructor_overloading('A');
		
	}

}
