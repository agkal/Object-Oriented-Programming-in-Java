//Name:     Abdul Ghaffar Kalhoro
//Reg: No:  194699
//Class:    BSCS_6C
//Lab_2     Task_2



package task_2;


import java.util.Scanner;

public class Task_2 {

	public static void main(String args[]){
		
		Scanner number = new Scanner(System.in);
	
		int distance;	//variable used for finding distance. 
		int litres;		//Number of litres.
		float mileage;
                float addition=0;
		System.out.print("Enter distance or -1 to exit: ");
		distance= number.nextInt();
		
		
		while(distance!=-1){
		
			System.out.print("Enter litres used: ");
			litres= number.nextInt();
			
			mileage= (float) distance/litres;
			addition+=mileage;
			System.out.printf("Total mileage is %.3f\n\n",mileage);
			
			
			System.out.print("Enter distance or -1 to exit: ");
			distance= number.nextInt();
			
		}
                
		System.out.printf("\nTotal mileage = %.2f\nThanks!",addition);
		
	}
}
