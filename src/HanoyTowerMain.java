import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

import Classes.HanoyTower;

public class HanoyTowerMain {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите количество блинчиков в башне: ");
        int pancake = Integer.parseInt(reader.readLine());

        HanoyTower tower = new HanoyTower();
        tower.calcTower(pancake,"1", "2", "3");
        ArrayList<String> movesArray = tower.getResult();
        Iterator<String> iterator = movesArray.iterator();

        System.out.printf("\nДля количества блинчиков в башне %d решение следующее: \n", pancake);
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
