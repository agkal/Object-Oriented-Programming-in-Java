//Name:     Abdul Ghaffar Kalhoro
//Reg: No:  194699
//Class:    BSCS_6C
//Lab_2     Task_4



package task_4;


import java.util.Scanner;

public class Task_4 { 
    public static void main(String[] args) { 
        int M,N;
        double P;
      
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        M= input.nextInt();
         System.out.print("Enter number of columns: ");
        N= input.nextInt();
         System.out.print("Enter probability ");
        P= input.nextDouble();
        
        //Making an array name game.
        boolean[][] game = new boolean[M+2][N+2];
        for (int i = 1; i <= M; i++)
        {
            for (int j = 1; j <= N; j++)
                game[i][j] = (Math.random() < P);
        }
        // print game
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++){
                if (game[i][j])
                    System.out.print("* ");
                else            
                    System.out.print(". ");
                }
            System.out.println();   //new line
        }

        // temp[i][j] is the number of bombs adjacent to cell respected cell.
        int[][] temp = new int[M+2][N+2];
        for (int i = 1; i <= M; i++){
            for (int j = 1; j <= N; j++)
                //Neighboring cells
                for (int ii = i - 1; ii <= i + 1; ii++)
                    for (int jj = j - 1; jj <= j + 1; jj++)
                        if (game[ii][jj]) temp[i][j]++;
            }
        // print solution
        System.out.println();
        for (int i = 1; i <= M; i++) {
            for (int j = 1; j <= N; j++) {
                if (game[i][j])
                    System.out.print("* ");
                else            
                    System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }

    }
}