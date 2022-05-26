package Problem2;

public class Main {
	
	public static void main(String[] args) {
		
		DayScholar d1 = new DayScholar();
		double remainingDay = d1.PayFee(4500);
		System.err.println("Dayscholar's remaining fee : Rs."+remainingDay);
		
		System.out.println(" ");		
		
		Hosteller h1 = new Hosteller();
		double remainingHostel = h1.PayFee(6000);
		System.err.println("Hosteller's remaining fee : Rs."+remainingHostel);
	}

	
}

class Student {
	
	int studentID;
	String studentName;
	double examFee;
	
	void DisplayDetails() {}
	
	double PayFee(double feePaid) {
		double remaining = examFee - feePaid;
		return remaining;
	}
}

class DayScholar extends Student{
	
	DayScholar(){
		this.examFee = 5000;
	}
	
	double TransportFee() {
		double transport = 3000;
		return transport; 
	}
	
	
}

class Hosteller extends Student{
	
	Hosteller(){
		this.examFee = 7000;
	}
	
	double HostelFee() {
		double hostelFee = 5000;
		return hostelFee;
	}
}
