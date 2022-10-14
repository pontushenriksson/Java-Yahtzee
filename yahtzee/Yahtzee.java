// Dependencies
package yahtzee;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.IntFunction;

import javax.lang.model.util.ElementScanner14;

import java.io.BufferedReader;
import java.io.File;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Yahtzee {

    public static void main(String[] args) throws InterruptedException, IOException {

        // Variables
        Scanner Input = new Scanner(System.in);
        int[][] tärningar = { { 6, 5, 4, 3, 2, 1 }, { 6, 5, 4, 3, 2, 1 }, { 6, 5, 4, 3, 2, 1 }, { 6, 5, 4, 3, 2, 1 },
                { 6, 5, 4, 3, 2, 1 } };
        ArrayList<Integer> combOne = new ArrayList<Integer>();
        combOne.add(1);
        combOne.add(11);
        combOne.add(111);
        combOne.add(1111);
        combOne.add(11111);

        int sorted1 = 0;
        int sorted2 = 0;
        int sorted3 = 0;
        int sorted4 = 0;
        int sorted5 = 0;
        int roll = 0;
        int dice1Roll = 1;
        int dice2Roll = 1;
        int dice3Roll = 1;
        int dice4Roll = 1;
        int dice5Roll = 1;

        int firstTime = 1;
        int printAll = 1;
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

            while (i != 6) {

                int TärningsSlag1 = (int) (Math.random() * 4 + 1);
                int NummerPåTärning1 = (int) (Math.random() * 6 + 1);
                int a = Integer.valueOf((tärningar[TärningsSlag1][NummerPåTärning1]));
                ArrayList<Integer> currentArray = new ArrayList<Integer>();
                if (dice1Roll == 1 && i == 1 || sorted1 == 0) {
                    sorted1 = a;

                } else if (dice2Roll == 1 && i == 2 || sorted2 == 0) {
                    sorted2 = a;

                } else if (dice3Roll == 1 && i == 3 || sorted3 == 0) {
                    sorted3 = a;

                } else if (dice4Roll == 1 && i == 4 || sorted4 == 0) {
                    sorted4 = a;

                } else if (dice5Roll == 1 && i == 5 || sorted5 == 0) {
                    sorted5 = a;

                }

                currentArray.add(sorted1);
                currentArray.add(sorted2);
                currentArray.add(sorted3);
                currentArray.add(sorted4);
                currentArray.add(sorted5);
                if (printAll == 5) {
                    System.out.println(currentArray);
                }
                printAll++;
                i++;

            }
            i = 0;
            System.out.println("Do you want to re-roll any dice? 1 = yes, 0 = no.");
            roll = Input.nextInt();

            if (roll == 1) {
                i = 1;
                System.out.println("Do you want to re-roll dice one with a" + " " + sorted1 + "?" + " "
                        + "1 for yes and 0 for no.");
                dice1Roll = Input.nextInt();
                System.out.println("Do you want to re-roll" + " " + sorted2 + "?" + " " + "1 for yes and 0 for no.");
                dice2Roll = Input.nextInt();
                System.out.println("Do you want to re-roll" + " " + sorted3 + "?" + " " + "1 for yes and 0 for no.");
                dice3Roll = Input.nextInt();
                System.out.println("Do you want to re-roll" + " " + sorted4 + "?" + " " + "1 for yes and 0 for no.");
                dice4Roll = Input.nextInt();
                System.out.println("Do you want to re-roll" + " " + sorted5 + "?" + " " + "1 for yes and 0 for no.");
                dice5Roll = Input.nextInt();

            } else if (roll != 1 || roll != 0) {
                System.out.println("Please enter 1 or 0. Enter 1 to re-roll and 0 to skip.");
            } else if (roll == 0) {
                System.out.println("Skipping re-roll!");
            }

        }
        if (i == 2) {
            System.out.println(
                    "Gameplay: In each turn a player may throw the dices up to three times. A player doesn't have to roll all five dices on the second and third throw of a round, he may put as many dice as he wants to the side and only throw the ones that don't have the numbers he's trying to get. For example, a player throws and gets 1,3,3,4,6. He decides he want to try for the large straight, 1,2,3,4,5. So, he puts 1,3,4 to the side and only throws 3 and 6 again, hoping to get 2 and 5.");
            System.out.println(
                    "Combinations: Hehe");

        } else if (i != 1) {
            System.out.println("Wrong Input, Reload game");
        }

    }
}
