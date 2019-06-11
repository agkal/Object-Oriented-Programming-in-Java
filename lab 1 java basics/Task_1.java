
//Name:   Abdul Ghaffar Kalhoro
//Reg: number:   194699
//Lab_1   task_1
//Objective:  to find the G.P.A"
package task_1;


import java.util.Scanner;
public class Task_1 
{
    public static void main(String args[])
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Write the year of the student");
      String year =scan.next();
      System.out.println("Write the number of courses student is taking");
      int course=scan.nextInt();
      System.out.println("Write the GPA of the student");
      float GPA=scan.nextFloat();
      
      System.out.printf("year of student:%s",year);
      System.out.printf("\nNumber of course:%d",course);
      System.out.printf("\nGPA of the student:%.2f",GPA);
      
    }
    
}
