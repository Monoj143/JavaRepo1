package JavaBasics;

public class StaticNonStatic{

	int a=20;
	static int i = 100;
	static String s = "Beginnersbook";
	
	//Static method
	 static void display()
	{
		System.out.println("i:"+i);
		System.out.println("i:"+s);
	}

	//non-static method
	void funcn()
	{
		//Static method called in non-static method
		display();
		System.out.println("i:"+a);
	}

	public static void main(String[] args) {
		
		StaticNonStatic obj = new StaticNonStatic();
		obj.funcn();
		display();
	}
}
