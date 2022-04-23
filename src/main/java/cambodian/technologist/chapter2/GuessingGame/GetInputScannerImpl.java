package cambodian.technologist.chapter2.GuessingGame;

import java.util.Scanner;

public class GetInputScannerImpl implements GetInput{

    @Override
    public int input() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}
