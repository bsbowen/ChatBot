package org.example;

import java.util.Scanner;

public class chatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //call methods
        greetUser();
        repeatName(scanner);
        guessAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);
    }

    //method to greet user
    public static void greetUser() {
        System.out.println("Hello! Welcome to the Chat Bot.!");
    }

    //user to repeat name
    public static void repeatName(Scanner scanner) {
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you " + name + "!");
    }

    //method to guess age
    public static void guessAge(Scanner scanner) {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "!");
    }

    //method to count to a number
    public static void countToNumber(Scanner scanner) {
        System.out.println("Enter a number that you would like me to count to? ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println(i);
        }
    }

    //Method to test programing knowledge
    public static void testProgrammingKnowledge(Scanner scanner) {
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Which of these is not a programming language?");
        System.out.println("1. Java 2. Python 3. HTML 4. C++?");
        int answer;
        do {
            System.out.print("Enter your answer: ");
            answer = scanner.nextInt();
            if (answer != 3) {
                System.out.println("Please, try again.");
            }
        } while (answer != 3);

        System.out.println("Congratulations! You are correct.");
    }
}