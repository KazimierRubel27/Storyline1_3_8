import java.util.Scanner;

public class Storyline1_3_8 {
    public static String twoChoices(String optionOne, String optionTwo) {
        Scanner userChoice = new Scanner(System.in);
        System.out.println("You have two options,");
        System.out.println("A: " + optionOne);
        System.out.println("B: " + optionTwo);
        String choice = userChoice.nextLine().toUpperCase();

        while (!choice.equals("A") && !choice.equals("B")) {
            System.out.println("Please choose either A or B");
            System.out.println("A: " + optionOne);
            System.out.println("B: " + optionTwo);
            choice = userChoice.nextLine().toUpperCase();
        }

        return choice;
    }

    public static void main(String[] args) {
        System.out.println("You are a special agent working for the CIA. " +
                "Your mission is to diffuse a bomb that has been placed on the top of the Empire State Building. " +
                "After scaling the side, you reach the bomb. What do you do next?");

        String choice = twoChoices("Call the expert before touching the bomb",
                "Waste no time and take out your defusing tools");

        if (choice.equals("A")) {
            System.out.println("You call the expert, but they don't pick up, and you waste precious time.");
            System.out.println("You now have to cut a wire without help.");
            choice = twoChoices("Cut red wire", "Cut yellow wire");
            if (choice.equals("A")){
                System.out.println("You hear a loud noise and think you cut the wrong wire, but it was just a bird, nothing happens");
            } else {
                System.out.println("Nothing happens")
            }
            System.out.println("Now you have one wire left")
            choice = twoChoices("Wait for the time to expire")
        } else {
            System.out.println("You trip and your tools snag a wire, cutting it. Luckily, the bomb doesn't blow up.");
        }
    }
}
