package Problem4;

import java.util.Scanner;

public class Demo {
	
	public static Bank getBank(String bank) {
		
		if(bank.equals("axis")) {
			Bank axis = new AxisBank();			
			return axis;
		}
		else if(bank.equals("icici")) {
			Bank icici = new ICICIBank();			
			return icici;
		}
		else {
			return null;
		}
	}

	public static void main(String[] args) {		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Bank Name (like axis, icici, etc.) :");
		String bank = sc.next();
				
		Bank res = Demo.getBank(bank);
		if(res != null) {
			res.DisplayDetails();
			
			if(res.branchName.equals("Axis Bank, Lonawala")) {
				AxisBank ax = (AxisBank)res;
				System.out.println("<=======================================>");
				ax.getCreditCard();			}
		}
		else {
			System.out.println("It is null");
		}
		
		
		
	}
}


class Bank {
	
	String branchName;
	String ifscCode;
	
	void DisplayDetails() {
		System.out.println(this.branchName);
		System.out.println(this.ifscCode);
	}
}

class AxisBank extends Bank{
	double rateOfInterest = 6;
	
	{
		this.branchName = "Axis Bank, Lonawala";
	}
	
	@Override
	void DisplayDetails() {
		System.out.println("Branch Name : Axis Bank, Lonawala");
		System.out.println("IFSC : AXIS0005436");
		System.out.println("Rate of Interest : "+ this.rateOfInterest + "%");
	}
	
	void getCreditCard() {
		System.out.println("Get the Credit Card from the Axis Bank");
	}
	
	
}

class ICICIBank extends Bank{
	double rateOfInterest = 5.6;
	
	{
		this.branchName = "ICICI Bank, Lokhandwala";
	}
	
	@Override
	void DisplayDetails() {
		System.out.println("Branch Name : ICICI Bank, Lokhandwala");
		System.out.println("IFSC : ICICI004558");
		System.out.println("Rate of Interest : "+ this.rateOfInterest + "%");
	}
}