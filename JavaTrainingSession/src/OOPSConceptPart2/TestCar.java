package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {

		// Static polymorphism ...... Compile time polymorphism
		Bmw bmw = new Bmw();
		bmw.start();
		bmw.stop();
		bmw.thefSafty();

		System.out.println("**********************");

		Car car = new Car();
		car.start();
		car.stop();
		car.refuel();

		System.out.println("**********************");
		
		//Top Casting 
		Car car1 = new Bmw(); // Child class object can be refereed by parent
								// class reference variable .... Dynamic
								// polymorphism..Run-time polymorphism
		car1.start();
		car1.stop();
		
		//Down Casting 
		Bmw b1=(Bmw)new Car();   //ClassCastException

	}

}
