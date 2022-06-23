package JavaBasics;

public class LargestNum {
	public static void main(String[] args) {
		int a = 400;
		int b = 800;
		int c = 500;
		if (a > b & a > c) {
			System.out.println("a is greater : " + a);
		} else if (b > c) {
			System.out.println("b is greater : " + b);
		} else {
			System.out.println("c is greater : " + c);
		}
	}
}