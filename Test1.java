package Demo.practice.pack;

class A1
{
	int i;
	static int j;
	
	public void m1()
	{
		i++;
		j++;
	}
	public void display()
	{
		System.out.println(i+" "+j);

	}
}
public class Test1 {

	public static void main(String[] args) {
		A1 a1 = new A1();
		a1.m1();
		a1.display();


		A1 a2 = new A1();
		a2.m1();
		a2.display();
		
		A1 a3 = new A1();
		a3.m1();
		a3.display();
		
	}

}
