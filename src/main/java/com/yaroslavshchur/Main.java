package main.java.com.yaroslavshchur;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] array = new int[20];
        random(array);
        minOfArray(array);
        maxOfArray(array);
        sortAscending(array);
        sortDescending(array);
        SumOfElements(array);
        arraySquaring(array);
        secondTask();
        int[] massive = new int[]{3, 2, 3, 1, 4, 2, 8, 3};
        replaceDublicates(massive);
    }
    public static void random(int[] array) {
        for (int x = 0; x < array.length; x++) {
            array[x] = (int) (Math.random() * 50);

        }
        printArray(array);
    }
    public static void minOfArray(int[] array) {
        int min = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
        }
        System.out.println("Min of array is : " + min);
    }
    public static void maxOfArray(int[] array) {
        int max = array[0];
        for (int i : array) {
            if (max < i) {
                max = i;
            }
        }
        System.out.println("Max of array is : " + max);
    }
    public static void SumOfElements(int[] array) {
        int add = 0;
        for (int value : array) {
            add = add + value;
        }
        System.out.println("SumOfElements : " + add);
    }
    public static void sortAscending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (array[k] > array [k + 1]) {
                    int x = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = x;
                }
            }
        }
        printArray(array);
    }
    public static void sortDescending(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (array[k] < array[k + 1]) {
                    int x = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = x;
                }
            }
        }
        printArray(array);
    }
    public static void arraySquaring(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);
        }
        printArray(array);
    }
    static void secondTask() {
        String[][] array = {
                {"I",  "can", "help", "you?"}
                , {"I", "love", "to eat", "pie"}
                , {"In the", "Idea", "programming", "Java"}
                , {"I", "ran", "with a friend", "in the morning"}
        };
        for (int g = 0; g < array.length; g++) {
            System.out.print(array[g][g] + " ");
        }
        System.out.println(" ");
    }
    public static void replaceDublicates(int[] massive) {
        for (int j = 0; j < massive.length; j++) {
            for (int i = j + 1; i < massive.length; i++) {
                if (massive[j] == massive[i]) {
                    massive[i] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(massive));
    }
    public static void printArray(int[] myArray) {
        for (int value : myArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
