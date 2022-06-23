package OOPSConceptPart1;

public class Car {

	String mod;
	int modNo;
		
	public static void main(String[] args) {
	
		Car a=new Car();
		Car b=new Car();
		
		a.mod="BMW-1x";
		a.modNo=123;
		
		System.out.println(a.mod);
		System.out.println(a.modNo);
		
		a=b;
		a.modNo=50;
		System.out.println(a.modNo);
		
		b.modNo=66;
		System.out.println(a.modNo);
		
	}
}
