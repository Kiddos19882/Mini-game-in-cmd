package Game;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<Integer> locationCells;
    int numOfHits = 0;

    String checkYourSelf(Integer userGuess) {
        String result;
        int index = locationCells.indexOf(userGuess);
        if (index >= 0) {
            numOfHits++;
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        } else {
            result = "Мимо";
        }
        return result;
    }

    public void setLocationCells(ArrayList<Integer> locationCells) {
        this.locationCells = locationCells;
    }
}

