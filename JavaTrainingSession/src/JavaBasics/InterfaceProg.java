package JavaBasics;

interface A{
	
	int a=10;
	void m1();
}
interface C extends A{

	 abstract void m2();
}
class InterfaceProg implements A,C{

	public void m1() {

		System.out.println("Demo1 method");
		System.out.println(A.a);
	}
	public void m2() {
		System.out.println("Demo2 method");	
	}
	public static void main(String[] args) {

		InterfaceProg obj = new InterfaceProg();
		obj.m1();
		obj.m2();
	}
}
