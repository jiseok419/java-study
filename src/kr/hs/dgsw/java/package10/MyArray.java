package kr.hs.dgsw.java.package10;

import java.util.Random;

public class MyArray {
    int[] array = new int[10];

    void init() {
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
    }

    int getMax() {
        int maxValue = 0;

        for (int value: array) {
            if(maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    int sum() {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    double average() {
        return (double) sum() / array.length;
    }

    int findMin() {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    void printArray() {
        for (int i = 0 ; i < array.length; i++) {
            if(i != 0) {
                System.out.print(", ");
            }
            System.out.printf("%d", array[i]);
        }
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.init();
        System.out.println("[총합] : " + myArray.sum());
        System.out.println("[평균] : " + myArray.average());
        myArray.printArray();
    }
}
