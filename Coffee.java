//Factory design pattern
package StarbucksCoffee;
public abstract class coffee {
	
	protected abstract double getcost();
	
	public static Coffee getBasicCoffee(int type){
		Coffee c = null;
	    if(type == 1) {
	    	System.out.println("Preparing Cappuccino...");
			 c = new Cappuccino();
	    }
	    else if(type == 2) {
	    	System.out.println("Preparing Frappaccino...");
			 c = new Frappaccino();
	    }
	    else if(type == 3) {
	    	System.out.println("Preparing Latte...");
			 c = new Latte();
	    }
	    else if(type == 4) {
	    	System.out.println("Preparing Mocha...");
			 c =  new Mocha();
	    }
		
		return c;
	}
}

class Cappuccino extends Coffee
{
	double price;
	public Cappuccino()
	{
		price = 4.07;
	}
	protected double getcost()
	{
		return price;
	}
	
}

class Frappaccino extends Coffee
{
	double price;
	
	Frappaccino()
	{
		price=4.15;
	}
	
	protected double getcost()
	{
		return price;
	}
	
}

class Latte extends Coffee
{
   double price;
	
    Latte()
	{
		price=3.75;
	}
	
	protected double getcost()
	{
		return 3.75;
	}
	
}

class Mocha extends Coffee
{
   double price;
	
    Mocha()
	{
		price=3.5;
	}
	
	protected double getcost()
	{
		return 3.5;
	}
	
}
