/**
 * Java 1. Homework 1
 *
 * @author Ivan
 * @version 22.03.2022
 */

class HomeWork1 {

    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 2, b = -8;
        System.out.println(a + b >= 0? "Positive" : "Negative");
    }

    static void printColor() {
        int value = 50;
        System.out.println("value =" + value);
        if (value <= 0) {
            System.out.println("Red");
        } else if (value <= 100) {
            System.out.println("Yellow");
        } else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a = 10, b = 20;
        System.out.println(a >= b? "a >= b" : "a < b");
    }
}
