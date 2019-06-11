//Name:				Abdul Ghaffar kalhoro
//Reg_No:			194699
//Class:			BSCS-6C
//Lab #3_Task3. 


import java.util.Scanner;

public class DateTest {
public static void main(String [] args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter year: ");
	int year = input.nextInt();

	System.out.print("Enter month: ");
	int month = input.nextInt();

	System.out.print("Enter day: ");
	int day = input.nextInt();

	/*Creating object 'date' of class Task_3*/
	Task_3 date = new Task_3(year, month, day);	
	System.out.println("The entered date in the format D/M/Y is:");
		date.displayDate();
}
}