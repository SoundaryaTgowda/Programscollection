package javaclass;

public class Vote 
{
	void Age_criteria()
	{
		int age;
		age=18;
		if(age>=18)
		{ 
			System.out.println("He/she is eligible to Vote");
		}
		else
		{
			System.out.println("He/She is not eligible to Vote");
		}
	}
	public static void main(String[] args)
	{
		Vote v1= new Vote();
		v1.Age_criteria();
	}
	

}
