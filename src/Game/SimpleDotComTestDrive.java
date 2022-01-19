package Game;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleDotComTestDrive {
    public static void main(String[] args) throws NumberFormatException {
        int numOfGuesses = 0;

        GameHelper helper = new GameHelper();
        SimpleDotCom s = new SimpleDotCom();

        int randomLocation = (int) (Math.random() * 6);
        ArrayList<Integer> locations = new ArrayList<>(Arrays.asList(randomLocation, randomLocation + 1, randomLocation + 2));
        s.setLocationCells(locations);

        System.out.print(locations);
        System.out.println(" ");

        while (true) {
            Integer user_line = helper.getUserInput();
            String result = s.checkYourSelf(user_line);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                System.out.println(result);
                System.out.println("Вам потребовалось " + numOfGuesses + " попыток(и)");
                break;
            } else if (result.equals("Попал")) {
                System.out.println(result);
            } else {
                System.out.println(result);
            }
        }
    }
}

