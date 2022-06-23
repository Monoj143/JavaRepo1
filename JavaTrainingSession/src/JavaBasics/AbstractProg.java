package JavaBasics;

abstract class X{
	
	int a=100;
	abstract void m1();

	void m2 ()
	{
		System.out.println("Non-abstract method");
	}
}
class AbstractProg extends X {

	void m1() {
		System.out.println("Abstract method");
		System.out.println(a);
	}
	public static void main(String[] args) {

		AbstractProg obj = new AbstractProg();
		obj.m1();
		obj.m2();
	}

}
