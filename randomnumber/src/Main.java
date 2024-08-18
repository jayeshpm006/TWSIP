import java.lang.Math;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                 Scanner scan = new Scanner(System.in);

                double v = Math.random()*100;
                int i  = (int)v;
        System.out.println(i);
        System.out.println("Welcome to the Guess Game");
        System.out.println("You will be asked to guess the number to win the game");
        System.out.println("You have maximum 5 attempt Limit");
        for (int j=0; j<5; j++){
            System.out.println("Enter a Number Between 1 to 100");
            int a = scan.nextInt();

            if (i > a){
                System.out.println("Entered number is smaller");
            } else if (i < a) {
                System.out.println("Entered number is greater");

            }
            else {
                System.out.println("Entered Number is correct");
                break;
            }
        }
            }
        }
