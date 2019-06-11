//Abdul Ghaffar Kalhoro
//Class: BSCS-6C
//Reg: No: 194699
//ASSIGNMENT-1		Object Oriented Programing

//Objective: To find the prime numbers using Sieve of Eratosthenes Method.
//Question#2


public class PrimeNum {
	
	public static void main(String args[]){
	boolean pArray[]= new boolean[1000];	//creating a boolean array with 1000 indices
	int counter;	//counter variable
	
	for (counter =2;counter<pArray.length;counter++)	//initialising the array elements to true
	{
		pArray[counter]=true;
	}

	for(counter=2;counter*counter<pArray.length;counter++)	//for loop for initialising non prime numbers as a false.
	{	
		 if (pArray[counter]) 	
		 {
             for (int temp = counter; counter*temp < pArray.length; temp++)  //for loop for making the numbers multiples of counter as false.
             {
                 pArray[counter*temp] = false;
             }
            
             }
		  }	

		System.out.println("The prime numbers are: ");

	for (counter =0;counter<pArray.length;counter++)//printing the prime numbers.
		{
		if(pArray[counter]){
		System.out.println(counter);

		}
			}//end for loop	
				} //end main method
					} //end class