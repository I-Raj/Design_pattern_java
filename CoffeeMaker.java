package StarbucksCoffee;


// We have just one coffee maker. Hence making it a singleton pattern to make sure no more than instance is created.
public class CoffeeMaker {
	private static CoffeeMaker cmaker = null;
	
	private  CoffeeMaker() // No class outside should be able to create an object of CoffeeMaker.
	{
		System.out.println("Starting Coffee Maker...");
	}
	
	public static CoffeeMaker getCoffeeMaker(){
		if(cmaker == null)
			return new CoffeeMaker();
		else
			return cmaker;
	}
}


