package javaclass;

public class Assignment13 
{
	static void planet()
	{
		System.out.println("Earth");
	}
	public void satellite()
	{
		System.out.println("Moon is a Natural Satellite");
	}
	public static void main(String[] args)
	{
		planet();
		Assignment13 ns= new Assignment13();
		ns.satellite();
	}
}
