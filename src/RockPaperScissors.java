import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String moveA, moveB, playAgain;
        boolean playGame = true;

        while (playGame) {
            // Get move choice from player A
            System.out.print("Player A, enter your move (R/P/S): ");
            moveA = input.nextLine().toUpperCase();
            while (!moveA.equals("R") && !moveA.equals("P") && !moveA.equals("S")) {
                System.out.println("Invalid move. Please enter R/P/S: ");
                moveA = input.nextLine().toUpperCase();
            }

            // Get move choice from player B
            System.out.print("Player B, enter your move (R/P/S): ");
            moveB = input.nextLine().toUpperCase();
            while (!moveB.equals("R") && !moveB.equals("P") && !moveB.equals("S")) {
                System.out.println("Invalid move. Please enter R/P/S: ");
                moveB = input.nextLine().toUpperCase();
            }

            // Determine the winner
            if (moveA.equals(moveB)) {
                if (moveA.equals("S")) {
                    System.out.println("Scissors vs Scissors it's a Tie!");
                } else if (moveA.equals("P")) {
                    System.out.println("Paper vs Paper it's a Tie!");
                } else {
                    System.out.println("Rock vs Rock it’s a Tie!");
                }
            } else if (moveA.equals("R") && moveB.equals("S")) {
                System.out.println("Player A wins! Rock smashes scissors.");
            } else if (moveA.equals("P") && moveB.equals("R")) {
                System.out.println("Player A wins! Paper covers rock.");
            } else if (moveA.equals("S") && moveB.equals("P")) {
                System.out.println("Player A wins! Scissors cuts paper.");
            } else if (moveB.equals("R") && moveA.equals("S")) {
                System.out.println("Player B wins! Rock smashes scissors.");
            } else if (moveB.equals("P") && moveA.equals("R")) {
                System.out.println("Player B wins! Paper covers rock.");
            } else if (moveB.equals("S") && moveA.equals("P")) {
                System.out.println("Player B wins! Scissors cuts paper.");
            }

            // Ask to play again
            System.out.print("Play again? (Y/N): ");
            playAgain = input.nextLine().toUpperCase();
            while (!playAgain.equals("Y") && !playAgain.equals("N")) {
                System.out.println("Invalid input. Please enter Y or N: ");
                playAgain = input.nextLine().toUpperCase();
            }
            if (playAgain.equals("N")) {
                playGame = false;
            }
        }
        input.close();
    }
}
