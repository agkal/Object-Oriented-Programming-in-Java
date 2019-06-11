
//Name:   Abdul Ghaffar Kalhoro
//Reg: number:   194699
//Lab_1   Task_2


package task_2;


import java.util.Scanner;
 
public class Task_2 {
    public static void main (String [] args) {
         
        Scanner value = new Scanner (System.in);
         
        int number; //number entered by the user
        int first_no; //first digit of number
        int second_no; //second digit of number
        int third_no; //third digit of number
        int fourth_no; //fourth digit of number
        int fifth_no; //fifth digit of number
         
        System.out.println (); //new line display
         
        System.out.print ("Enter An Integer Number Consisting of Five Digits: ");
        number = value.nextInt();
         
        fifth_no = number % 10;
        fourth_no = (number % 100)/10;
        third_no = (number % 1000)/100;
        second_no = (number % 10000)/1000;
        first_no = (number % 100000)/10000;
         
        System.out.println ();
         
        System.out.printf ("%d   %d   %d   %d   %d\n", first_no, second_no, third_no, 
                fourth_no, fifth_no);
         
    }
}