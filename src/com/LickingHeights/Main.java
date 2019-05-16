package com.LickingHeights;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userTurn;
        String computerTurn = "";
        int computerInt;
        String response;
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        Random variable = new Random();
        System.out.println("Would you like to play Alaska Roxxy Jinx?");

        keyboard.nextLine();
        computerInt = variable.nextInt(3)+1 ;
        if (computerInt == 1)
            computerTurn = "Alaska";
        else if (computerInt == 2)
            computerTurn = "Roxxy";
        else if (computerInt == 3)
            computerTurn = "Jinx";
        System.out.println("Alaska Roxxy Jinx shook:");
        userTurn = keyboard.next();
        userTurn = userTurn.toUpperCase();
        System.out.println("I pick: " + computerTurn);

        if (Objects.equals(userTurn, computerTurn))
            System.out.println("Tie");
        else if (userTurn==("Alaska"))
            if (computerTurn==("Jinx"))
                System.out.println("Alaska beats Jinx. You win!");
            else if (userTurn==("Roxxy"))
                System.out.println("Roxxy beats Alaska. You loose :(");
            else if (userTurn==("Roxxy"))
                if (computerTurn==("Jinx"))
                    System.out.println("Jinx beats Roxxy. You loose :(");
                else if (userTurn==("Alaska"))
                    System.out.println("Roxxy beats Alaska. You win!");
                else if (userTurn==("Jinx"))
                    if (computerTurn==("Roxxy"))
                        System.out.println("Jinx beats Roxxy. You win!");
                    else if (computerTurn==("Alaska"))
                        System.out.println("Alaska beats Roxxy. You loose :(");
                    else
                        System.out.println("What u on??? wrong game!");

    }
}
