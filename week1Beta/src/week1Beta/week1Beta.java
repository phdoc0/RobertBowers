package week1Beta;

public class week1Beta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create a variable to hold the quantity of available plan seats left on a flight
		
		int seatsAvailableOnPlan = 100;
		
		//create a variable to hold the cost of groceries at checkout
		
		double costOfGroceriesAtCheckout = 138.98;
				
		//create a variable to hold a person’s middle initial
		
		char myMiddleInitial = 'Z';
		
		//create a variable to hold true if it’s hot outside and false if it’s could outside
		
		boolean itIsHotOutside = false;
		
		//create a variable to hold a customer’s first name
		
		String customerFirstName = "Robert";
		
		//create a variable to hold a street address
		
		String nameOfStreet = "Williams";
		
		//print all variable to the console
		
		System.out.println(seatsAvailableOnPlan);
		System.out.println(costOfGroceriesAtCheckout);
		System.out.println(myMiddleInitial);
		System.out.println(itIsHotOutside);
		System.out.println(customerFirstName);
		System.out.println(nameOfStreet);
		
		//a customer booked 2 plane seats, remove 2 seats from the available seats variable
		
		int numberOfNewSeatsAvailable = seatsAvailableOnPlan - 2;
		
		
		//impulse candy bar purchase, add 2.15 to the grocery total
		
		double newGroceryTotalAtCheckout = costOfGroceriesAtCheckout - 2.15;
		
		//birth certificate was printed incorrectly, change the middle initial to something else
		
		char correctedMiddleInitial = 'E';
		
		//the season has changed, update the hot outside variable to be opposite of what it was
		
		boolean newTempOutside = !itIsHotOutside;
		
		
		//create a new variable called full name using the customer’s first name, the middle initial and last name of our choice
		
		String fullNameOfCustomer = customerFirstName +" "+ correctedMiddleInitial + " Bowers";
		
		//System.out.println(fullNameOfCustomer);
		
		
		//print a line to the console that introduces the customer and says they live at the address variable

		System.out.println("Hi, this is my customer " + fullNameOfCustomer +", and he lives on " + nameOfStreet + " Street.");
	
	}

}
