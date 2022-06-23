package JavaBasics;

public class B {
	
	//private static B obj = new B();
	
	private B()
	{
		System.out.println("Private constructor");
	}
	
	public void m1()
	{
		System.out.println("Normal Method");
	}
	
	public static B getObj()
    {
        return  new B();
    }
}
