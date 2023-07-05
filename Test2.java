package Demo.practice.pack;

class A2
{
	int i;
	static int j;
	void m1()
	{
		i=3;
	}
	void m3()
	{
		i=5;
	}
	void display()
	{
		System.out.println("i="+i+"  "+"j="+j);

	}
	
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a1 = new A2();
		a1.m1();
		a1.display();


		A2 a2 = new A2();
		a2.m1();
		a2.display();
		
		A2 a3 = new A2();
//		a3.m1();
		a3.m3();
		a3.display();

	}

}
