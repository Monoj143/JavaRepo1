package JavaBasics;

public class LocalVsGlobalVariables {

	String name = "Monoj";
	int Age = 28;

	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.Age);
		System.out.println(obj.name);
		int sum = obj.details();
		System.out.println(sum);

	}

	public int details() {
		int i = 1;
		int j = 20;
		int k = i + j;
		return k;
	}

}
