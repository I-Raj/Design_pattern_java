//Decorator Design pattern
package StarbucksCoffee;

public abstract class Topping extends Coffee {
	
	public Topping()
	{
		System.out.println("Adding toppings");
	}
	
}

class Whipcream extends Topping
{
	Coffee c;
    Double price;
    
    Whipcream(Coffee c){
    	System.out.println("Adding Whipcream...");
    	this.c = c;
    	price = 0.5;
    }
	
    @Override
	protected double getcost() {
		// TODO Auto-generated method stub
		return c.getcost() + price;
	}
	
}

class Cinnamon extends Topping
{
	Coffee c;
    Double price;
    
    Cinnamon(Coffee c){
    	System.out.println("Adding Cinnamon...");
    	this.c = c;
    	price = c.getcost() + 0.43;
    }
	
    @Override
	protected double getcost() {
		// TODO Auto-generated method stub
		return price;
	}
	
}

class Caramel extends Topping
{
	Coffee c;
    Double price;
    
    Caramel(Coffee c){
    	System.out.println("Adding Caramel...");
    	this.c = c;
    	price = c.getcost() + 0.61;
    }
	
    @Override
	protected double getcost() {
		// TODO Auto-generated method stub
		return price;
	}
	
}



