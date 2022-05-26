package Problem3;

public class Pro_3 {
	
	//Ques  What is the use of 'this' and 'super' keyword in java? Explain with example.
	/*Ans   In JAVA, 'this' and 'super' keywords are used while a class inherits the properties 
	 * 		of an other class, 'this' is used to refer the current class and 'super' is used to
	 * 		refer the parent class.
	 * 		It's not mandatory to use 'this' only while a class inherits other's properties.
	 * 		It can be used anywhere and it always refers the current class.
	 * 		But 'super' is always used to refer a parent class.
	 * 
	 *  	Below is an example -  
	 *  	We created a Vehicle class and a Car class, where Vehicle is a parent class and Car is
	 *  	a child class, because Car is extending properties from Vehicle class.
	 *  
	 *  	So, when we invoked Difference method inside Car class, it printed first this.Runs and
	 *  	then super.Runs
	 *  	this.Runs printed 'Car runs!' ==> this is pointing to current (Car) class.
	 *  	and super.Runs printed 'Vehicle runs!' ==> super is pointing to parent (Vehicle) class.
	 * 
	 */
	
	public static void main(String[] args) {
		Car c1 = new Car();
		c1.Difference();
		
	}

}

class Vehicle {
	void Runs () {
		System.out.println("Vehicle runs!");
	}
}

class Car extends Vehicle {
	@Override
	void Runs () {
		System.out.println("Car runs!");
	}
	
	void Difference() {
		this.Runs();
		super.Runs();
	}	
}
