package com.LickingHeights;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userTurn;
        String computerTurn ="";
        int computerInt;
        String response;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        Random variable = new Random();
        System.out.println("Would you like to play Alaska Roxxy Jinx?");
        computerInt = variable.nextInt(3)+1;

        if (computerInt == 1)
            computerTurn = "Alaska";

        else if(computerInt == 2)
            computerTurn = "Roxxy";

        else if(computerInt == 3)
            computerTurn = "Jinx";

        System.out.println("Alaska Roxxy Jinx shook:");
        userTurn = keyboard.next();
        System.out.println("I pick: "+computerTurn);

        



}
