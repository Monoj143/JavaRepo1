package OOPSConceptPart1;

public class FunctionInJava {

	public static void main(String arg[]) {
		
		FunctionInJava obj=new FunctionInJava();
		int sum=obj.add();
		System.out.println("Sum :" + sum);
		
		int divs=obj.div(10, 2);
		System.out.println("Div :" + divs);
		
		String str=obj.name();
		System.out.println("Name :" + str);
	}

	public int add() {
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
	}

	public String name() {
		String s = "monoj";
		return s;
	}

	public int div(int x, int y) {
		int z = x / y;
		return z;
	}
}
