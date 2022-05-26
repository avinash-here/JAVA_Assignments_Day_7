package Problem1;

public class Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.name = "Ramesh Agarwal";
		emp1.age = 28;
		emp1.phone = "8247156865";
		emp1.address = "Gurugram";
		emp1.salary = 44000;
		
		Manager man1 = new Manager();
		man1.name = "Paresh Vishwakarma";
		man1.age = 32;
		man1.phone = "8210563284";
		man1.address = "Bangalore";
		man1.salary = 56580;
		
		
		System.out.println("Employee Details :");
		System.out.println("Name : "+emp1.name);
		System.out.println("Age : "+emp1.age);
		System.out.println("Phone Number : "+emp1.phone);
		System.out.println("Address : "+emp1.address);
		System.out.println("Salary : "+emp1.salary);
		System.out.println("<=============================>");
		System.out.println("Manager Details :");
		System.out.println("Name : "+man1.name);
		System.out.println("Age : "+man1.age);
		System.out.println("Phone Number : "+man1.phone);
		System.out.println("Address : "+man1.address);
		System.out.println("Salary : "+man1.salary);
	}
}

class Member {
	
	String name;
	int age;
	String phone;
	String address;
	double salary;
	
	void printSalary() {
		System.out.println(salary);
	}
}

class Employee extends Member{
	
	String specialisation;
	String department;
}

class Manager extends Member{
	
	String specialisation;
	String department;
}
