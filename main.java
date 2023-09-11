import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        int answer = (int) (Math.random() * 100 + 1);
        int k = 5;
        Scanner sc = new Scanner(System.in);
        boolean correct = false;
        System.out.println("Hey User! Welcome to the number guessing game!");
        System.out.println("In this game, you have to guess a number between 1 and 100.");
        System.out.println("You have 5 tries to guess the number.");

        while (k > 0){
            System.out.println("Enter the number: ");
            int guess = sc.nextInt();

            if(guess == answer){
                System.out.println("You guessed the correct number!\n You win!");
                correct = true;
                break;
            } else if (guess > answer) {
                System.out.println("Your guess is too high.\nYou have " + (k-1) + " tries left.");
            } else {
                System.out.println("Your guess is too low.\nYou have " + (k-1) + " tries left.");
            }

            k--;

        }

        if(!correct){
            System.out.println("You ran out of all your tries\nYou lose!");
            System.out.println("The correct number was " + answer);
        }

        sc.close();
    }
}