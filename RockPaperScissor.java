import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        String[] rps = {"r", "p", "s"};
        String computerMove = rps[new Random().nextInt(rps.length)];
        Scanner scan = new Scanner(System.in);
        String playerMove;

        while (true) {
            System.out.println("Plese enter your move(r, p or s):");
            playerMove = scan.next();
            if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                break;
            }
            System.out.println(playerMove + "is not valid move!!");
        }
        System.out.println("Computer played : "+ computerMove);
        if (playerMove.equals(computerMove))
            System.out.println("The game was tie!!");

        else if (playerMove.equals("r")) {
            if (computerMove.equals("p"))
                System.out.println("You lose!");
            else if (computerMove.equals("s"))
                System.out.println("You win");
        }
        else if (playerMove.equals("p")) {
            if (computerMove.equals("r"))
                System.out.println("You win!!");
            else if (computerMove.equals("s"))
                System.out.println("You lose!");

        }
        else if (playerMove.equals("s")) {
            if (computerMove.equals("p"))
                System.out.println("You win!");
            else if (computerMove.equals("r"))
                System.out.println("You lose!");
        }
    }
}