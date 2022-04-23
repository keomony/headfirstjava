package cambodian.technologist.chapter2.GuessingGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;
    GetInput getInput;

    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        getInput = new GetInputScannerImpl();
        //Generate random number from 0 to 9 and
        //store it in targetNumber
        int targetNumber = (int) (Math.random() * 10);

        while(true) {
            System.out.println("please input number to guess");
            System.out.println("player 1");
            int guessNumberP1 = p1.guess(getInput.input());
            System.out.println("player 2");
            int guessNumberP2 = p2.guess(getInput.input());
            System.out.println("player 3");
            int guessNumberP3 = p3.guess(getInput.input());

            System.out.println("The number is " + targetNumber);

            if(isGuessCorrectly(guessNumberP1, guessNumberP2, guessNumberP3, targetNumber))
            {
                System.out.println("We have a winner!!!");
                break;
            } else {
                System.out.println("Guess again");
            }
        }

    }

    //TODO: allow any number of players to guess
    private boolean isGuessCorrectly(int guessNumberP1, int guessNumberP2,
                                    int guessNumberP3, int targetNumber) {
        return (guessNumberP1 == targetNumber ||
                guessNumberP2 == targetNumber ||
                guessNumberP3 == targetNumber);

    }

}
