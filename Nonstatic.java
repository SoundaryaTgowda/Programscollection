package javaclass;

public class Nonstatic 
{
	void flower()
	{
		System.out.println("Rose");
	}

   void animal()
   {
	System.out.println("Tiger");
   }
   void bird()
   {
	   System.out.println("Peacock");
   }

public static void main(String[] args)
{
	Nonstatic s1= new Nonstatic();
	s1.flower();
	s1.animal();
	s1.bird();
}
}