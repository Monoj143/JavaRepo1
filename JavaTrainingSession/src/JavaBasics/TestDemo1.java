package JavaBasics;

interface ABC{	
	void m1();
}
public class TestDemo1 implements ABC{

	public void m1() {
		System.out.println("TestDemo1");	
	}
	public static class TestDemo2 implements ABC
	{
		public void m1() {
			System.out.println("TestDemo2");	
		}	

		public static void main(String[] args) {

			TestDemo1 obj= new TestDemo1();
			obj.m1();

			/*TestDemo2 obj1= new TestDemo2();
			obj1.m1();
*/
		}
	}
}
