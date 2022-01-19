package Game;

import java.util.Scanner;

public class GameHelper {
    public Integer getUserInput() {
        Scanner user_input = new Scanner(System.in);
        int cell;
        while (true) {
            String user_line;
            System.out.print("Введите число от 0 до 7: ");
            try {
                user_line = user_input.nextLine();
                cell = Integer.parseInt(user_line);
                break;
            } catch (NumberFormatException e) {
                System.err.println("Не правильный ввод");
                System.out.println(" ");
            }
        }
        return cell;
    }
}
