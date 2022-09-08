package Classes;

import java.util.ArrayList;

public class HanoyTower {
    private final ArrayList<String> movesArray;

    public HanoyTower(){
        this.movesArray = new ArrayList<String>();
    }

    public void calcTower(int moves, String firstPin,String secondPin,String thirdPin) {
        if(moves==1) {
            movesArray.add("Блинчик " + moves + " со шпильки " + firstPin + " на шпильку " + thirdPin + "");
            return;
        }

        calcTower(moves-1, firstPin,thirdPin,secondPin);
        this.movesArray.add("Блинчик " + moves + " со шпильки " + firstPin + " на шпильку " + thirdPin + "");
        calcTower(moves-1,secondPin,firstPin,thirdPin);
    }

    public ArrayList<String> getResult(){
        return this.movesArray;
    }
    public static void main(String[] args) {

    }
}