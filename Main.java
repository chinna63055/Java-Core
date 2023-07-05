package Demo.practice.pack;

class A
{
	static int j;
	int i;
	
	{
		System.out.println("j="+j);
		// i value cannot be accessed as a value
		// because of non-static variable
		System.out.println("i="+i);
	}
	{
		System.out.println("i="+i++);
	}
	
}
public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A name = new A();
		System.out.println(name.i);
		System.out.println("i=+"+name.i);
		System.out.println("i="+name.i++);
		System.out.println("i="+name.i++);
	}

}
