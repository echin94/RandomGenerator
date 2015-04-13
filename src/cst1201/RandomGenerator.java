package cst1201;

import java.util.Random;
import java.util.Scanner;

public class RandomGenerator {

    public static void main(String[] args) {
        //TODO: Create a Scanner object to read keyboard input.
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt() + 1;
        System.out.println(num);
        
        //TODO: Ask the user a lower and upper bound.
        
        //TODO: Ask the user for the number of random integers to generate.
        
        //TODO: Generate random integers of the desired length and bound.
        
        //TODO: Print the average, max, min, count, and sum of the integers.
    }
}
