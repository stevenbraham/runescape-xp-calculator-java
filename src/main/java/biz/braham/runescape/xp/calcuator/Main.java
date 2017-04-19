package biz.braham.runescape.xp.calcuator;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 * User: stevenbraham
 * Date: 20-04-17
 * Time: 00:33
 */
public class Main {
    public static void main(String[] args) {
        int currentXp = 0, requestedLevel = 0, costsPerAction = 0;
        double xpPerAction = 0.0;
        //collect data
        try {
            // create a scanner so we can read the command-line input
            Scanner scanner = new Scanner(System.in);
            //ask inpute
            System.out.println("Welcome to Runescape xp Calculator\n(C)2017 Steven Braham\n\n");
            System.out.print("Your current XP:");
            currentXp = scanner.nextInt();
            System.out.print("Level you want to achieve:");
            requestedLevel = scanner.nextInt();
            System.out.print("XP gain per action:");
            xpPerAction = scanner.nextDouble();
            System.out.print("Costs per action (GP):");
            costsPerAction = scanner.nextInt();
        } catch (Exception e) {
            //something went wrong
            System.out.println("Error reading input");
            System.exit(1);
        }
        //init xp calculator
        XPCalculator xpCalculator = new XPCalculator(currentXp, requestedLevel, costsPerAction, xpPerAction);
        //get results
        Result result = xpCalculator.calculate();
        //display results
        System.out.println("Current level: " + Integer.toString(result.currentLevel) + " = " + Integer.toString(currentXp) + " xp");
        System.out.println("Requested level: " + Integer.toString(result.requestedLevel) + " = " + Integer.toString(result.requiredXp) + " xp");
        System.out.println("XP required: " + Integer.toString(result.requiredXp) + " xp");
        System.out.println("You need to train: " + Integer.toString(result.actionsNeeded) + " times");
        System.out.println("This will cost you: " + Integer.toString(result.totalCost) + " GP");
    }
}