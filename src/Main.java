import java.sql.SQLOutput;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int lottary = (int)(Math.random() * 100);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your lottary pick (two digits) : ");
        int guess = input.nextInt();

        int lottaryDigit1 = lottary / 10;
        int lottaryDigit2 = lottary % 10;

        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottary number is " + lottary);

        if(guess==lottary)
            System.out.println("Exact match: you win $10.000");
        else if(guessDigit2 == lottaryDigit1 && guessDigit1 == lottaryDigit2)
            System.out.println("Match all digits: you win $3.000");
        else if(guessDigit1 == lottaryDigit1 || guessDigit1==lottaryDigit2 || guessDigit2==lottaryDigit1 || guessDigit2 == lottaryDigit2)
            System.out.println("Match one digit: you win $1.000");
        else
            System.out.println("Sorry, no match");

    }
}