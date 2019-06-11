//Name:	Abdul Ghaffar Kalhoro
//Reg: no:	194699
//Class: BSCS-6C
//Finding BMI.

import java.util.Scanner;

public class Task_1 {

	public static void main(String args[]){
	Scanner input = new Scanner(System.in);
	
	double weight, height;
	double BMI;
	
	System.out.print("Enter your weight in kg: ");
	weight = input.nextDouble();
	
	System.out.print("Enter your height in meters: ");
	height = input.nextDouble();
	
		BMI = weight/(height*height);
		
	System.out.printf("your BMI is %.3f\n",BMI);
		
		if (BMI < 18.5)
			System.out.println("under weight");
		else if(BMI >=18.5 && BMI<= 24.9)
			System.out.println("Normal");
		else if(BMI >=25 && BMI< 29.9)
			System.out.println("Over weight");
		else{
			System.out.println("Obese");
		}
	
	}
	
}