
//Name:     Abdul Ghaffar Kalhoro
//Reg: No:  194699
//Class:    BSCS_6C
//Lab_2     Task_3




package task_3;


import java.util.Scanner;

public class Task_3 {

    
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
String [] suit = { "Clubs", "Diamonds", "Hearts", "Spades"};
String [] rank =
{
"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
};

int value=5;

int players;
System.out.print("Enter number of players: ");
    players = input.nextInt();



String [] deck = new String [suit.length * rank.length];

for (int i = 0; i < suit.length; i++)
for (int j = 0; j < rank.length; j++)
deck [rank.length * i + j] = rank [j] + " of " + suit[i];
for (int k = 0; k < (suit.length * rank.length); k++)
    
modify_deck(deck);
 
 for (int i = 0; i < players * value; i++) {
            System.out.print(deck[i]);
            System.out.print(", ");
            if (i % value == value - 1)
                System.out.println();
        }


}
    





private static void modify_deck(String [] deck)
{
int N = deck.length;
for (int i = 0; i < N; i++)
{
int r = i + (int) (Math.random() * (N - i));
String t = deck[i];
deck[i] = deck[r];
deck[r] = t;
}
}
}