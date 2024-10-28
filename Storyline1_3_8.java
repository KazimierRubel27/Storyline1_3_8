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
        Scanner playChoice = new Scanner(System.in);
        String play = "Y";
        while (play.equals("Y")) {
            System.out.println("You are a special agent working for the CIA. " +
                    "Your mission is to diffuse a bomb that has been placed on the top of the Empire State Building. " +
                    "After scaling the side, you reach the bomb. What do you do next?");

            if (twoChoices("Call the expert before touching the bomb",
                    "Waste no time and take out your defusing tools").equals("A")) {
                System.out.println("You call the expert, but they don't pick up, and you waste precious time.");
                System.out.println("You now have to cut a wire without help.");
                if (twoChoices("Cut red wire", "Cut yellow wire").equals("A")) {
                    System.out.println(
                            "You hear a loud noise and think you cut the wrong wire, but it was just a bird, nothing happens");
                } else {
                    System.out.println("Nothing happens");
                }
                System.out.println("Now you have one wire left");
                if (twoChoices("Wait for the time to expire", "Cut the other wire").equals("A")) {
                    System.out.println(
                            "You let time expire and in the last 5 seconds you here fast beeping and the bomb explodes");
                } else {
                    System.out.println(
                            "You cut the other wire, and a deactivation sound plays, the bomb was succesfully disabled");
                }
            } else {
                System.out.println(
                        "You trip and your tools snag a yellow wire, cutting it. Luckily, the bomb doesn't blow up.");
                System.out.println("You now are left with a bomb with one wire cut");
                if (twoChoices("You cut the the remaining red wire", "You wait for time to expire").equals("A")) {
                    System.out.println(
                            "You cut the red wire, and the bomb immideatly explodes, killing everyone including you");
                } else {
                    System.out.println(
                            "You cut the other wire, and a strong beeping can be heard, however it was from a microwave underneath you, the bomb was succesfully disabled");
                }
            }
            System.out.print("\nWould you like to play again?");
            String playTwo = playChoice.nextLine().toUpperCase();
            if (play.length() > 0) {
                play = playTwo.substring(0, 1);
            }
        }
        playChoice.close();

    }

}