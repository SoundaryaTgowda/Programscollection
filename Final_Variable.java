package javaclass;

public class Final_Variable 
{
	final int a=10;
	int b=20;
	void sum()
	{
		int add=a+b;
		System.out.println("Sum of 2 numbers--->>" +add);
	}
	public static void main(String[] args) 
	{
		Final_Variable fv1= new Final_Variable();
		fv1.sum();
		}

}
