package Examples_Java.Example001_Seminar1;

import java.util.Scanner;

/**
 * program
 */
public class program {

    public static void main(String[] args) {

        searchMaxCountAndPrint();
    }

    private static void searchMaxCountAndPrint() {

        int[] array = { 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0 };
        int count = 0;
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
                if (count > max)
                    max = count;
            } else {
                count = 0;
            }
        }

        System.out.println(max);
    }

    private static void printName() {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String name = input.nextLine();

        System.out.printf("Hello, %s!", name);
        input.close();
    }

}