import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Make a move (rock/paper/scissors)");
        String playerMove = scanner.nextLine();

        Random random = new Random();
        int randomNumber = random.nextInt(3);

        String computerMove;
        if (randomNumber == 0){
            computerMove = "rock";
        } else if (randomNumber ==1) {
            computerMove = "paper";
        } else {
            computerMove = "scissors";
        }
        System.out.println("Computer chose " + computerMove);

        if (playerMove.equals(computerMove)){
            System.out.println("It's a draw");
        } else if (playerWins(playerMove, computerMove)) {
            System.out.println("Player wins");
        } else {
            System.out.println("Computer wins");
        }
    }
    static boolean playerWins(String playerMove, String computerMove){
        if (playerMove.equals("rock")){
            return computerMove.equals("scissors");
        } else if (playerMove.equals("paper")) {
            return computerMove.equals("rock");
        } else {
            return computerMove.equals("paper");
        }
    }
}