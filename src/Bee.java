
public class Bee {
	public String name;
	public String color;
	public boolean dangerous;
	public boolean flight;
	public boolean isQueen;
	public int age;
	public int honeyQuantity;
	
	public Bee()
	{

	}
	
	public Bee(String name, String color, boolean dangerous, boolean flight, boolean isQueen, int age, int honeyQuantity)
	{
		this.name = name;
		this.color = color;
		this.dangerous = dangerous;
		this.flight = flight;
		this.isQueen = isQueen;
		this.age = age;
		this.honeyQuantity = honeyQuantity;
	}
	
	public void Age()
	{
		System.out.println("Age of bee: " + age);
	}
	
	public void Color()
	{
		System.out.println("Color of bee: " + color);
	}
	
	public void ChangeName(String n)
	{
		name = n;
		System.out.println("New name: " + n);
	}
	
	public void ChangeAge(int a)
	{
		age = a;
		System.out.println("New age: " + a);
	}
	
	public void ChangeThreadLevel(boolean x)
	{
		dangerous = x;
		System.out.println("Still dangerous: " + x);
	}
	
	public String ChangeName2()
	{
		return name;
	}
	
	public int ChangeAge2()
	{
		return age;
	}
	
	public boolean ChangeThreadLevel2()
	{
		return dangerous;
	}
}
