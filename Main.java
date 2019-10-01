package StarbucksCoffee;
import java.util.Scanner;

public class Main {
	 public static void main(String args[])
	   {
		CoffeeMaker coffeemaker=CoffeeMaker.getCoffeeMaker();
        System.out.println("What would you like today?");
	    System.out.println("1. Cappuccino");
	    System.out.println("2. Frappuccino");
	    System.out.println("3. Latte");
	    System.out.println("4. Mocha");
	    Scanner in = new Scanner(System.in);
	    int i = Integer.parseInt(in. nextLine());
	    
		Coffee c = Coffee.getBasicCoffee(i);
         
        while(true)
        {
        System.out.println("Want to add toppings?");
	    System.out.println("1. Whipcream");
	    System.out.println("2. Cinnamon");
	    System.out.println("3. Caramel");
	    System.out.println("4. I'm good!");
        Scanner sc = new Scanner(System.in);
	    int j = Integer.parseInt(in. nextLine());
        switch(j){
            case 1: 	c = new Whipcream(c);
                        break;
            case 2:     c = new Cinnamon(c);
                        break;
            case 3:     c = new Caramel(c);
                        break;
            case 4:     System.out.println("Thank you for ordering coffee! Your bill is $ "+ c.getcost());
            	        return;
        }
        }
		
		}
	}
