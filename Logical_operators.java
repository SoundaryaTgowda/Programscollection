package javaclass;

public class Logical_operators 
{
int a=100;
int b=50;

	void Andoperator()
	{
		if(a>=b && b<a)
		{
			System.out.println("And operator Gonna Execute");
		}
		else
		{
			System.out.println("And operator section doesn't executes");
		}
	}

	void Oroperator()
	{
		if(a<b || a>b)
		{
			System.out.println("Or operator going to be execute");
		}
		else
		{
			System.out.println("Or operator section doesn't executes");
		}
		
	}
	void Andnotoperator()
	{
		if(!(a==b && b>=a))
		{
			System.out.println("AndNot operator section gonna print");
		}
		else
		{
			System.out.println("AndNot operator section not gonna print");
		}
			
	}
	public void Ornotoperator()
	{
		if(!(a<b || b>a))
		{
			
				System.out.println("OrNot operator section gonna print");
			}
			else
			{
				System.out.println("OrNot operator section not gonna print");
			}
		}
	
		
	public static void main(String[] args)
	{
		Logical_operators l1= new Logical_operators();
		l1.Andoperator();
		l1.Oroperator();
		l1.Andnotoperator();
		l1.Ornotoperator();
	}
		
	}


