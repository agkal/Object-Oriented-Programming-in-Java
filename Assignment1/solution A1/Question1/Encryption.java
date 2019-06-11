//Abdul Ghaffar Kalhoro
//Class: BSCS-6C
//Reg: No: 194699
//ASSIGNMENT-1		Object Oriented Programming

//Objective: To convert the 4 digit number into encrypted form.
//Question#1

import java.util.Scanner;

public class Encryption {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	int number;
	int temp13, temp24;
	int digit1,digit2,digit3,digit4;	
		System.out.print("Enter the four digit integer: ");
		
		number= input.nextInt();
		
		if(number>=10000)
			System.out.println("Invalid digit");
		//Encryption
		else{
	//separating the digits
		digit1 = number/1000;
		digit2=(number%1000)/100;
		digit3= (number%100)/10;
		digit4= number%10;
		
	//Encrypting by adding 7 and taking remainder by 10.
		digit1 = encrypt(digit1);
		digit2 = encrypt(digit2);
		digit3 = encrypt(digit3);
		digit4 = encrypt(digit4);
		
	//	swapping 1st digit with 3rd.
		temp13 = digit1;
		digit1 = digit3;
		digit3 = temp13;
		
	// swapping 2nd digit with 4th.	
		temp24 = digit2;
		digit2 = digit4;
		digit4 = temp24;
		
	//printing the number in encrypted form
		System.out.printf("\nThe number in encrypted form is:"+" %d%d%d%d",digit1,digit2,digit3,digit4);
		
		}	//end else statement
	}	//end main method

	//declaring function.
	private static int encrypt(int digit){
		
		return digit = (digit+7)%10;	//encrypting according to the given condition.
	}
}