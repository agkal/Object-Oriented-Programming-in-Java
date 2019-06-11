//Name:				Abdul Ghaffar kalhoro
//Reg_No:			194699
//Class:			BSCS-6C
//Lab #3_Task2.


public class Employee {
	String first_Name;
 	String last_Name;
 	double monthly_Salary;

 	public Employee(String fN, String lN, double mN){
 		first_Name = fN;
 		last_Name = lN;
 		
 		if(mN < 0){
 			monthly_Salary =0;
 		}
 		else monthly_Salary = mN;
 		}

 public String getFirstName() {
	 return first_Name;
 }
 public void setFirstName(String F_name) {
	 first_Name = F_name;
 }
 public String getLastName() {
	 return last_Name;
}
public void setLastName(String L_name) {
last_Name = L_name;
}
public double getMonthlySalary() {
return monthly_Salary;
}
public void setMonthlySalary(double mnth) {
if(mnth < 0){
monthly_Salary =0;
}
else {
	monthly_Salary = mnth;
}
}
}