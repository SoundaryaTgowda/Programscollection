package javaclass;

public class Nonstatic_para 
{
	void mkt51(int batch,String name)
	{
		System.out.println("mkt51 non-static method gonna print");
	}
	void vehicle(String car1, String car2)
	{
		System.out.println("vehicle nonstatic method gonna print");
	}
	void marks(char grade, int rank )
	{
		System.out.println("Marks nonstatic method gonna print");
	}
	void emp(int age, double salary)
	{
		System.out.println("emp nonstatic method gonna print");
	}
	public static void main(String[] args) 
	{
		Nonstatic_para ns1= new Nonstatic_para();
		ns1.mkt51(51, "SoundaryaT");
		ns1.vehicle("hyundai", "Swift");
		ns1.emp(35, 98000);
		ns1.marks('A', 2);
		
	}

}
