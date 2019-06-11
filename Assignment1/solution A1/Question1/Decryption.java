//Abdul Ghaffar Kalhoro
//Class: BSCS-6C
//Reg: No: 194699
//ASSIGNMENT-1		Object Oriented Programing

//Objective: To decrypt the given 4 digit number
//Question#1

import java.util.Scanner;

public class Decryption {

	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
	int Num;
	int temp13, temp24;
	int digit1,digit2,digit3,digit4;	
		System.out.print("Enter the four digit integer for decryption: ");
		
		Num= input.nextInt();
		
		if(Num>=10000)
			System.out.println("Invalid digit");
		//Encryption
		else{
	
		digit1 = Num/1000;
		digit2=(Num%1000)/100;
		digit3= (Num%100)/10;
		digit4= Num%10;
		
	//swapping 1st with 3rd.
		temp13 = digit1;
		digit1 = digit3;
		digit3 = temp13;
	//swapping 2nd with 4th.
		temp24 = digit2;
		digit2 = digit4;
		digit4 = temp24;

		//decrypting the digits
		digit1 = decrypt(digit1);
		digit2 = decrypt(digit2);
		digit3 = decrypt(digit3);
		digit4 = decrypt(digit4);
	//printing the decrypted integer.
		System.out.printf("\n The number in decrypted form is: %d%d%d%d",digit1,digit2,digit3,digit4);
		
		}
	}

	//calling function
	private static int decrypt(int value){
		
		if(value >= 7){
		 value = value-7;	//decrypting according to the given scheme of encryption.
		return value;
	}
		else{
			return value +10-7;	//decrypting according to the given scheme of encryption.
		}
}
}
