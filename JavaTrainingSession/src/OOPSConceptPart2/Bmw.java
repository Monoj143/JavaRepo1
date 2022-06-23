package OOPSConceptPart2;

public class Bmw extends Car{
	
	//When same methods is present in parent as well as in child class with the same name and same number of arguments, is called 
	//method overriding
	
	public void start(){ //Overridden method 
		System.out.println("BMW Start");
	}
	
	public void thefSafty(){
		System.out.println("BMW Safaty");
	}
}
