//Gabe Manning, CS121, Project 1
//2/8/23

import java.util.Scanner;
import java.util.Random;

public class PokemonBattle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //Gets the number of rounds
        int numrounds;
        System.out.println("Enter the number of rounds you would like to battle. (Choose an odd number to avoid a tie)");
        numrounds = Integer.parseInt(scanner.nextLine());
            if (numrounds % 2 == 0) {
                System.out.println("The battle may end in a tie");
            }

        // Initializes win totals
        int wins1 = 0;
        int wins2 = 0;

        //Runs the battle rounds
        for (int r = 1; r <= numrounds; r++) {
            //Says what round the battle is on
            System.out.println("Round " + r + "\n-------");

            //Player 1's Pokemon and stats
            System.out.println("Player 1:\nSelect a Pokemon");
            String poke1 = scanner.nextLine();
            System.out.println("Input the Pokemon's HP");
            int hp1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Choose your move");
            String move1 = scanner.nextLine();
            System.out.println("Enter the move's power");
            int power1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the Pokemon's speed");
            int speed1 = Integer.parseInt(scanner.nextLine());
            System.out.println();
            //Player 2's Pokemon and stats
            System.out.println("Player 2:\nSelect a Pokemon");
            String poke2 = scanner.nextLine();
            System.out.println("Input the Pokemon's HP");
            int hp2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Choose your move");
            String move2 = scanner.nextLine();
            System.out.println("Enter the move's power");
            int power2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter the Pokemon's speed");
            int speed2 = Integer.parseInt(scanner.nextLine());

            //Calculates the winner of the round
            while (hp1 > 0 && hp2 > 0) {
                if (speed1 > speed2) {
                    hp2 = hp2 - power1;
                    if (hp2 <= 0) {
                        System.out.println("Player 1's " + poke1 +  " wins this round using " + move1 + " with " + hp1 + " HP remaining!");
                        wins1 = wins1 + 1;
                    }
                    if (hp2 > 0) {
                        hp1 = hp1 - power2;
                        if (hp1 <= 0) {
                            System.out.println("Player 2's " + poke2 +  " wins this round using " + move2 + " with " + hp2 + " HP remaining!");
                            wins2 = wins2 + 1;
                        }
                    }
                }
                if (speed2 > speed1) {
                    hp1 = hp1 - power2;
                    if (hp1 <= 0) {
                        System.out.println("Player 2's " + poke2 +  " wins this round using " + move2 + " with " + hp2 + " HP remaining!");
                        wins2 = wins2 + 1;
                    }
                    if (hp1 > 0) {
                        hp2 = hp2 - power1;
                        if (hp2 <= 0) {
                            System.out.println("Player 1's " + poke1 +  " wins this round using " + move1 + " with " + hp1 + " HP remaining!");
                            wins1 = wins1 + 1;
                        }
                    }
                }
                if (speed1 == speed2) {
                    int randomnum = random.nextInt(2);
                    if (randomnum == 0) {
                        hp2 = hp2 - power1;
                        if (hp2 <= 0) {
                            System.out.println("Player 1's " + poke1 +  " wins this round using " + move1 + " with " + hp1 + " HP remaining!");
                            wins1 = wins1 + 1;
                        }
                        if (hp2 > 0) {
                            hp1 = hp1 - power2;
                            if (hp1 <= 0) {
                                System.out.println("Player 2's " + poke2 +  " wins this round using " + move2 + " with " + hp2 + " HP remaining!");
                                wins2 = wins2 + 1;
                            }
                        }
                    }
                    if (randomnum == 1) {
                        hp1 = hp1 - power2;
                        if (hp1 <= 0) {
                            System.out.println("Player 2's " + poke2 +  " wins this round using " + move2 + " with " + hp2 + " HP remaining!");
                            wins2 = wins2 + 1;
                        }
                        if (hp1 > 0) {
                            hp2 = hp2 - power1;
                            if (hp2 <= 0) {
                                System.out.println("Player 1's " + poke1 +  " wins this round using " + move1 + " with " + hp1 + " HP remaining!");
                                wins1 = wins1 + 1;
                            }
                        }
                    }
                }
            }
            //Gives the round win totals after each round
            System.out.printf("Wins\n----\nPlayer 1: %s\nPlayer 2: %s\n", wins1, wins2);
        }
        //Displays final score and the winner of the battle
        System.out.printf("\nFinal Score\n-----------\nPlayer 1: %s\nPlayer 2: %s\n\n", wins1, wins2);
        if (wins1 > wins2) {
            System.out.println("Player 1 wins the battle!");
        }
        else if (wins1 == wins2) {
            System.out.println("The battle ends in a tie!");
        }
        else {
            System.out.println("Player 2 wins the battle!");
        }
    }
}
