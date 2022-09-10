package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class ArrayCreator {

    private final BufferedReader reader;

    public ArrayCreator() throws IOException{
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    private int getArrayLength() throws IOException{
        System.out.print("Введите длину создаваемого массива: ");
        return Integer.parseInt(this.reader.readLine());
    }

    public ArrayList<Integer> createIntegerArray() throws IOException{

        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        System.out.println("Создаем массив Integer");
        int length = getArrayLength();

        for (int i = 0; i < length; i++) {
            list.add(rnd.nextInt(100));
        }
        return list;
    }

    public ArrayList<Double> createDoubleArray() throws IOException{

        ArrayList<Double> list = new ArrayList<>();
        Random rnd = new Random();
        System.out.println("Создаем массив Double");
        int length = getArrayLength();

        for (int i = 0; i < length; i++) {
            list.add(rnd.nextDouble(100));
        }
        return list;
    }
}
