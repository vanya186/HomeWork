class HomeWorkApp1 {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 2, b = -8;
        int c = a + b;
        System.out.println("c = " + c);
        if (c >= 0) {
            System.out.println("Sum is positive");
        } else {
            System.out.println("Sum is negative");
        }
    }

    public static void printColor() {
        int value = 50;
        System.out.println("value =" + value);
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value >= 0 && value <= 100) {
            System.out.println("Yellow");
        }
        if (value >= 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 10, b = 20;
        if (a >= b) {
            System.out.println("a >= b");
        }
        if (a < b) {
            System.out.println("a < b");
        }
    }
}