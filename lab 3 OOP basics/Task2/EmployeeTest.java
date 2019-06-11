//Name:				Abdul Ghaffar kalhoro
//Reg_No:			194699
//Class:			BSCS-6C
//Lab #3_Task2. 



import java.util.Scanner;

public class EmployeeTest {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		System.out.println("Write your first name: ");
		String FirstN = input.next();

		System.out.println("Write Your last name: ");
		String LastN = input.next();

		System.out.println("Enter your monthly Salary: ");
		double income = input.nextDouble();

		Employee eobject =new Employee(FirstN,LastN ,income );
		System.out.print("total salary of\" ");
		System.out.print(eobject.getFirstName()+" ");
		System.out.print(eobject.getLastName()+"\" = ");
		
		System.out.println(eobject.getMonthlySalary()*12);

		double newsalary= eobject.getMonthlySalary()*0.1+eobject.getMonthlySalary();
		eobject.setMonthlySalary(newsalary);

		System.out.println("again yearly salary of "+
			eobject.getFirstName()+" "+eobject.getLastName()+" = ");
		System.out.println(eobject.getMonthlySalary()*12);

			eobject.getMonthlySalary();
}
}