package OOPSConceptPart1;

public class CallByValuandCallByRef {
	int p;
	int q;
	public static void main(String[] args) {

		CallByValuandCallByRef obj = new CallByValuandCallByRef();
		int x = 30;
		int y = 40;
		//obj.sum(x, y);  //Call by value Or Pass by value 
		System.out.println(obj.sum(x, y));
		
		obj.p=50;
		obj.q=60;
		obj.swap(obj); //Call by reference
		System.out.println("After swap the values");
		System.out.println(obj.p);
		System.out.println(obj.q);
	}

	public int sum(int a, int b) {
		a=10;
		b=20;
		int c = a + b;
		return c;
		
	}
	//Call by reference
	public void swap(CallByValuandCallByRef t){   
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
		
	}
}
