package me.hebing.chattybot;

import java.util.Objects;
import java.util.Scanner;

public class ChattyBot {
    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        greeting("Bob", "2020");
        remindUserName();
        guessUserAge();
        count();
        testUserKnowledge(
                "What programming language is used to create me?",
                "Python", "Java", "C++", "Shell",
                "2"
        );
        end();
    }

    static void greeting(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindUserName() {
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

    static void guessUserAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Say the remainders of dividing your age by 3, 5 and 7.");
        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();
        int userAge = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println("Your age is " + userAge + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        //Reads the number user wants bot to count to
        int countToNumber = scanner.nextInt();
        //Counts
        for (int i = 0; i <= countToNumber; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void testUserKnowledge(String question, String option1, String option2, String option3, String option4, String correctAnswer) {
        //Asks question and lists options
        System.out.println("Let's test your programming knowledge.");
        System.out.println(question);
        System.out.println("1. " + option1);
        System.out.println("2. " + option2);
        System.out.println("3. " + option3);
        System.out.println("4. " + option4);
        //Reads user answer and checks if it is correct
        String userAnswer = scanner.next();
        userAnswer = userAnswer.trim();
        if (!Objects.equals(userAnswer, correctAnswer)) {
            System.out.println("Incorrect, please try again.");
        }


    }

    static void end() {
        System.out.println("Congratulations, have a nice day!");
    }
}