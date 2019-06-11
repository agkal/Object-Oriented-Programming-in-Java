
//Name:     Abdul Ghaffar Kalhoro
//Reg: No:  194699
//Class:    BSCS_6C
//Lab_2 Activity_4




package activityfour;



public class ActivityFour {
    
public static void main(String[] args) {
String [] suit = { "Clubs", "Diamonds", "Hearts", "Spades"};
String [] rank =
{
"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"
};
String [] deck = new String [suit.length * rank.length];

for (int i = 0; i < suit.length; i++)
for (int j = 0; j < rank.length; j++)
deck [rank.length * i + j] = rank [j] + " of " + suit[i];
for (int k = 0; k < (suit.length * rank.length); k++)
System.out.println(deck[k]);

System.out.println("\n*************************");
System.out.println("*************************");
modify_deck(deck);
for (int k = 0; k < (suit.length * rank.length); k++)
System.out.println(deck[k]);


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