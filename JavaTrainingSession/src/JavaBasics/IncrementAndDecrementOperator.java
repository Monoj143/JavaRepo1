package JavaBasics;

public class IncrementAndDecrementOperator {

	public static void main(String[] args) {

		int i = 1;
		int j = i++; // Post increment

		System.out.println("i value is : " + i);
		System.out.println("j value is : " + j);

		System.out.println("**********************************");

		int a = 1;
		int b = ++a; // Pre increment

		System.out.println("a value is : " + a);
		System.out.println("a value is : " + b);

		System.out.println("**********************************");

		int m = 1;
		int n = m--; // Post decrement

		System.out.println("m value is : " + m);
		System.out.println("n value is : " + n);

		System.out.println("**********************************");

		int p = 1;
		int q = --p; // Post decrement

		System.out.println("p value is : " + p);
		System.out.println("q value is : " + q);
	}
}
