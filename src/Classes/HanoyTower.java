package Classes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class HanoyTower {
    private final ArrayList<String> movesArray;
    private final int pancakes;

    public HanoyTower(String firstPinName, String secondPinName, String thirdPinName) {
        this.movesArray = new ArrayList<String>();
        this.pancakes = getPancakes();
        calcTower(this.pancakes, firstPinName, secondPinName, thirdPinName);
    }

    private void calcTower(int moves, String firstPin, String secondPin, String thirdPin) {
        if (moves == 1) {
            movesArray.add("Блинчик " + moves + " со шпильки " + firstPin + " на шпильку " + thirdPin + "");
            return;
        }

        calcTower(moves - 1, firstPin, thirdPin, secondPin);
        this.movesArray.add("Блинчик " + moves + " со шпильки " + firstPin + " на шпильку " + thirdPin + "");
        calcTower(moves - 1, secondPin, firstPin, thirdPin);
    }

    public void printResult() {
        Iterator<String> iterator = movesArray.iterator();

        System.out.printf("\nДля количества блинчиков в башне %d решение следующее: \n", this.pancakes);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    private int getPancakes() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество блинчиков в башне: ");
        try {
            return Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println(e.toString());
            return -1;
        }
    }
}