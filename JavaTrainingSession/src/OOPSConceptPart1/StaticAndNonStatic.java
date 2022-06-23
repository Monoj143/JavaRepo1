package OOPSConceptPart1;

public class StaticAndNonStatic {

	String name = "Monoj"; // Non static global variable
	static int age = 29; // Static global variable

	public static void main(String[] args) {

		// How to call static method and variables
		// 1.Direct calling
		fun1();
		// 2.Calling by class name
		StaticAndNonStatic.fun1();

		System.out.println(age);
		System.out.println(StaticAndNonStatic.age);

		// How to call non static method
		StaticAndNonStatic obj = new StaticAndNonStatic();
		obj.sendmail();
		System.out.println(obj.name);
		
	}

	public void sendmail() { // non static method
		System.out.println("Send mail");
	}

	public static void fun1() { // Static method
		System.out.println("Fun1");
	}
}
