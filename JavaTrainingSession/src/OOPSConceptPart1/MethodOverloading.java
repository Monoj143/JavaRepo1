package OOPSConceptPart1;

public class MethodOverloading {
	public static void main(String[] args) {
		MethodOverloading objref = new MethodOverloading();

		objref.sum();
		objref.sum(20);
		int sum1=objref.sum(20, 30);
		System.out.println(sum1);
	}
	
	//Method overloading : When the method name is same with different arguments or input parameters with the same class.  
	public void sum() {
		System.out.println("Sum Zero parameter");
	}

	public void sum(int a) {
		System.out.println("Sum one parameter");
		System.out.println(a);
	}

	public int sum(int x, int y) {
		System.out.println("Sum two parameter");
		//System.out.println(x + y);
		return x+y;
	}
}
