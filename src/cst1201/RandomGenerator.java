package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {
    /*
    *
    *@ author Evan Chin
    */

    public static void main(String[] args) {

        double average = 0.0;
        int sum = 0;
        int max = 0;
        int min = 0;
        //TODO: Create a Scanner object to read keyboard input.
        Scanner scanner = new Scanner(System.in);

        //TODO: Ask the user a lower and upper bound.
        System.out.println("Enter a lower bound: ");
        int lowerBound = scanner.nextInt();

        System.out.println("Enter an upper bound: ");
        int upperBound = scanner.nextInt();

        //TODO: Ask the user for the number of random integers to generate.
        System.out.println("How many integers do you want to generate?");
        int count = scanner.nextInt();
        System.out.println("Random Numbers: ");

        //TODO: Generate random integers of the desired length and bound.
        for (int i = 0; i < count; i++) {
            Random random = new Random();
            int num = random.nextInt((upperBound - lowerBound) + 1) + lowerBound;
            System.out.println(num);

            average += num;
            sum += num;
           
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
                }
            }
        //TODO: Print the average, max, min, count, and sum of the integers.
        average = average / count;

        System.out.println("The average of all the integers listed is: " + average);
        System.out.println("The maximum of all the integers listed is: " + max);
        System.out.println("The minimum of all the integers listed is: " + min);
        System.out.println("The number of integers listed is: " + count);
        System.out.println("The sum of all the integers listed is: " + sum);
    }
}
