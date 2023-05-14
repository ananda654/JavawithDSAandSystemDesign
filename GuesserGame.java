import java.util.*;

class Player {
    int guessedByPlayer;

    public int guessNumByPlayer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Player! Please enter the guessed number");
        guessedByPlayer = sc.nextInt();
        return guessedByPlayer;
    }

}

class Guesser {
    int guessedByGuaccer;

    public int getGuessedNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hi Guesser Please enter the guessed number");
        guessedByGuaccer = sc.nextInt();
        return guessedByGuaccer;
    }

}

class Umpire {
    int guessedNumberByGuesser;
    int guessedNumberByPlayer1;
    int guessedNumberByPlayer2;
    int guessedNumberByPlayer3;

    public void getNumberFromGursser() {
        Guesser guesser = new Guesser();
        guessedNumberByGuesser = guesser.getGuessedNumber();
    }

    public void getNumberFromPlayers() {
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();
        guessedNumberByPlayer1 = player1.guessNumByPlayer();
        guessedNumberByPlayer2 = player2.guessNumByPlayer();
        guessedNumberByPlayer3 = player3.guessNumByPlayer();
    }

    public void displayTheResult() {
        System.out.println(guessedNumberByPlayer1 + "  " + guessedNumberByPlayer2 + "  " + guessedNumberByPlayer3);
        if (guessedNumberByGuesser == guessedNumberByPlayer1) {
            if (guessedNumberByGuesser == guessedNumberByPlayer2 && guessedNumberByGuesser == guessedNumberByPlayer3) {
                System.out.println("Everyone has given the right answer");
            } else if (guessedNumberByGuesser == guessedNumberByPlayer2) {
                System.out.println("Player 1 and Player2 have given the right answer");
            } else if (guessedNumberByGuesser == guessedNumberByPlayer3) {
                System.out.println("Player1 and Player3 have given the right answer");
            } else {
                System.out.println("Player1 has given the right answer");
            }
        } else if (guessedNumberByGuesser == guessedNumberByPlayer2) {
            if (guessedNumberByGuesser == guessedNumberByPlayer3) {
                System.out.println("Player2 and Player3 has given the right answer");
            } else {
                System.out.println("Player2 has given the right answer");
            }
        } else if (guessedNumberByGuesser == guessedNumberByPlayer3) {
            System.out.println("Player3 has given the right answer");
        } else {
            System.out.println("Everyone has given the wrong answer");
        }
    }

}

class GuesserGame {
    public static void main(String[] args) {
        Umpire umpire = new Umpire();
        umpire.getNumberFromGursser();
        umpire.getNumberFromPlayers();
        umpire.displayTheResult();

    }
}