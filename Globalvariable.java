package javaclass;

public class Globalvariable 
{
	int a=10;
	static int b=5;
	
		void sum()
		{
			int add=a+b;
			System.out.println("the sum of 2numbers-->>"+add);
		}
		static void multiply()
		{
			Globalvariable g1= new Globalvariable();
			int prod=g1.a*b;
			System.out.println("The product of 2numbers-->>"+prod);
		} 
	
	public static void main(String[] args) 
	{
		Globalvariable g1=new Globalvariable();
		g1.sum();
		multiply();
	}

}
