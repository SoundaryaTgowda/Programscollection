package javaclass;

public class Methodoverloading 
{
	void whatsapp(int phno,String name)
	{
		System.out.println("Non static method gonna execute");
	}
	static void whatsapp(int phno)
	{
		System.out.println("Static method gonna execute");
	}
	public static void main(String[] args) 
	{
		Methodoverloading mo1= new Methodoverloading();
		mo1.whatsapp(587945666,"Ram");
		whatsapp(898566555);
		
	}

}
