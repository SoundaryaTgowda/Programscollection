package javaclass;

public class localvariable 
{
	void sum()
	{
		int a=5; int b=10;
		int add= a+b;
		System.out.println("The sum of local variables in Non static method is->>>"+add);
	}
	static void multiply()
	{
		int a=2; int b=1000;
		int mul=a*b;
		System.out.println("The product of local variables in static method is->>>"+mul);
	}
	public static void main(String[] args) 
	{
		localvariable v1= new localvariable();
		v1.sum();
		multiply();
		
	}

}
	
	
	
	
	
	
	
