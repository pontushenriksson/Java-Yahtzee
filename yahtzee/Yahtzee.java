// Dependencies
package yahtzee;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import java.util.Random;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;

public class Yahtzee {

    // Methods
    private static int useSpot;

    public static void main(String[] args) throws InterruptedException, IOException {

        // Variables
        Scanner Input = new Scanner(System.in);
        int[][] tärningar = { { 6, 5, 4, 3, 2, 1 }, { 6, 5, 4, 3, 2, 1 }, { 6, 5, 4, 3, 2, 1 }, { 6, 5, 4, 3, 2, 1 },
                { 6, 5, 4, 3, 2, 1 } };

        int roll = 1;

        int firstTime = 1;
        int ggr = 0;
        int dice1Roll = 1;
        int dice2Roll = 1;
        int dice3Roll = 1;
        int dice4Roll = 1;
        int dice5Roll = 1;

        int[] availableSpots = new int[13];
        // Ones
        availableSpots[0] = 1;
        // Twos
        availableSpots[1] = 1;
        // Threes
        availableSpots[2] = 1;
        // Fours
        availableSpots[3] = 1;
        // Fives
        availableSpots[4] = 1;
        // Sixes
        availableSpots[5] = 1;
        // Three of a kind
        availableSpots[6] = 1;
        // Four of a kind
        availableSpots[7] = 1;
        // Full house
        availableSpots[8] = 1;
        // Small straight
        availableSpots[9] = 1;
        // Large straight
        availableSpots[10] = 1;
        // Chance
        availableSpots[11] = 1;
        // Yahtzee
        availableSpots[12] = 1;

        String[] currentSpot = new String[13];

        currentSpot[0] = "Ones";
        currentSpot[1] = "Twos";
        currentSpot[2] = "Threes";
        currentSpot[3] = "Fours";
        currentSpot[4] = "Fives";
        currentSpot[5] = "Sixes";
        currentSpot[6] = "Three of a kind";
        currentSpot[7] = "Four of a kind";
        currentSpot[8] = "Full house";
        currentSpot[9] = "Small straight";
        currentSpot[10] = "Large straight";
        currentSpot[11] = "Chance";
        currentSpot[12] = "Yahtzee";

        // Code
        System.out.println("Welcome!" + " " + "Type 1 to start and type 2 to see the rules!");
        int i = Input.nextInt();

        while (i == 1) {
            if (firstTime == 1) {
                System.out.println("####################");
                System.out.println("Starting in 3 seconds...");
                Thread.sleep(1000);
                System.out.println("2 seconds...");
                Thread.sleep(1000);
                System.out.println("1 second...");
                Thread.sleep(1000);
                System.out.println("Starting...");
                System.out.println("####################");
                firstTime--;
            }

            System.out.println("----------------");
            System.out.println("Rolling dices...");
            System.out.println("----------------");

            int randomDice1 = (int) (Math.random() * 5);
            int randomDice2 = (int) (Math.random() * 5);
            int randomDice3 = (int) (Math.random() * 5);
            int randomDice4 = (int) (Math.random() * 5);
            int randomDice5 = (int) (Math.random() * 5);
            int slag1 = Integer.valueOf((tärningar[0][randomDice1]));
            int slag2 = Integer.valueOf((tärningar[1][randomDice2]));
            int slag3 = Integer.valueOf((tärningar[2][randomDice3]));
            int slag4 = Integer.valueOf((tärningar[3][randomDice4]));
            int slag5 = Integer.valueOf((tärningar[4][randomDice5]));

            int[] dicesArray = new int[5];
            dicesArray[0] = slag1;
            dicesArray[1] = slag2;
            dicesArray[2] = slag3;
            dicesArray[3] = slag4;
            dicesArray[4] = slag5;

            Arrays.sort(dicesArray);
            System.out.println("You rolled : "
                    + Arrays.toString(dicesArray));

            System.out.println("Do you want to re-roll any dice? 1 = yes, 0 = no.");
            roll = Input.nextInt();

            System.out.println("Do you want to re-roll dice one with a" + " " + slag1 + "?" + " "
                    + "1 for yes and 0 for no.");
            dice1Roll = Input.nextInt();
            System.out
                    .println("Do you want to re-roll" + " " + slag2 + "?" + " " + "1 for yes and 0 for no.");
            dice2Roll = Input.nextInt();
            System.out
                    .println("Do you want to re-roll" + " " + slag3 + "?" + " " + "1 for yes and 0 for no.");
            dice3Roll = Input.nextInt();
            System.out
                    .println("Do you want to re-roll" + " " + slag4 + "?" + " " + "1 for yes and 0 for no.");
            dice4Roll = Input.nextInt();
            System.out
                    .println("Do you want to re-roll" + " " + slag5 + "?" + " " + "1 for yes and 0 for no.");
            dice5Roll = Input.nextInt();

            if (dice1Roll == 1) {
                randomDice1 = (int) (Math.random() * 5);
                slag1 = Integer.valueOf((tärningar[0][randomDice1]));
            } else if (dice2Roll == 1) {
                randomDice2 = (int) (Math.random() * 5);
                slag2 = Integer.valueOf((tärningar[0][randomDice2]));
            } else if (dice3Roll == 1) {
                randomDice3 = (int) (Math.random() * 5);
                slag3 = Integer.valueOf((tärningar[0][randomDice3]));
            } else if (dice4Roll == 1) {
                randomDice4 = (int) (Math.random() * 5);
                slag4 = Integer.valueOf((tärningar[0][randomDice4]));
            } else if (dice5Roll == 1) {
                randomDice5 = (int) (Math.random() * 5);
                slag5 = Integer.valueOf((tärningar[0][randomDice5]));
            }

            else if (roll != 1 || roll != 0) {
                System.out.println("Please enter 1 or 0. Enter 1 to re-roll and 0 to skip.");
            }

            ggr++;

            if (ggr == 3) {
                i = 0;
                System.out.println("You got : "
                        + Arrays.toString(dicesArray));

                System.out.println("Where do you want to place the score?");

                System.out.println("These spots are available:");
                for (int printAvailable : availableSpots) {
                    int arraySpot = 0;
                    if (printAvailable == 1) {
                        System.out.println((currentSpot[arraySpot]));
                        System.out.println(printAvailable);
                    }
                    arraySpot++;
                }
                System.out.println("");
            }

            if (i == 2) {
                System.out.println("####################");
                System.out.println(
                        "- Gameplay: In each turn a player may throw the dices up to three times. A player doesn't have to roll all five dices on the second and third throw of a round, he may put as many dice as he wants to the side and only throw the ones that don't have the numbers he's trying to get. For example, a player throws and gets 1,3,3,4,6. He decides he want to try for the large straight, 1,2,3,4,5. So, he puts 1,3,4 to the side and only throws 3 and 6 again, hoping to get 2 and 5.");
                System.out.println("----------------");
                System.out.println("- Combinations: Hehe");
                System.out.println("####################");

            } else if (i != 1 && i != 0) {
                System.out.println("Wrong Input, Reload game and then enter the number 1 in the terminal");
            }

        }
    }
}
