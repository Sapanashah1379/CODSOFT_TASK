import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0;
        int turns=0;

        int sum = 0;
        Random ran = new Random();
        int random_num1 = ran.nextInt(100);
        System.out.println("Choose a number"+" between 1 to 100."+
                "Guess the number"+ " within 3 trials.");
        do {
            int guess_number = sc.nextInt();
            turns++;
            System.out.println("Guess number: " + guess_number);
            if (guess_number == random_num1) {
                System.out.println("Your Guess is correct.");
                System.out.println("Your Win");
                System.out.println("Your Total score is "+ ((11-turns)*10) +" out of 100");

                break;
            } else if (guess_number > random_num1) {
                System.out.println("Your guess is too high");

            } else {
                System.out.println("Your guess is too low");

            }
            i++;
            System.out.println("Play again");
        } while (i < 10) ;


    }


    }

