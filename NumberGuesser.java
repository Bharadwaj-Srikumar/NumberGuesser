import java.util.Scanner;
import javax.swing.*;
public class NumberGuesser {
	public static void main(String[] args) {
		int number = (int)(Math.random()*100+1);
		int count = 1;
		try (Scanner sc = new Scanner(System.in)) {
			while(count<11) {
				String response = JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100", "Guessing Game", 3);
			    int guess = Integer.parseInt(response);
				int remain = 10-count;
				if(guess<=0 || guess>100){
					JOptionPane.showMessageDialog(null, "Invalid Guess. Please enter a number between 1 and 100.(Remaining guesses = " + remain+")");
				}
				else if(guess==number) {
					JOptionPane.showMessageDialog(null, "You Won!(Remaining guesses = " + remain+")");
					JOptionPane.showMessageDialog(null, "Game Over");
					return;
				}
				else if(guess<number) {
					JOptionPane.showMessageDialog(null, "Guess is lower than the Number.(Remaining guesses = " + remain+")");
				}
				else if(guess>number) {
					JOptionPane.showMessageDialog(null, "Guess is higher than the Number.(Remaining guesses = " + remain+")");
				}
				else {
					JOptionPane.showMessageDialog(null, "Invalid input.(Remaining guesses = " + remain+")");
				}
				count++;
			}
			JOptionPane.showMessageDialog(null, "Game Over");
		}
	}
}
