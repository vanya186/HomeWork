/**
 * Java 1. Homework 2
 *
 * @author Ivan
 * @version 27.03.2022
 */

class HomeWorkApp2 {
    
    public static void main(String[] args) {
        System.out.println(checkSum(8, 10));
        checkSign(0);
        System.out.println(checkNumber(-5));
        printName(3);
        System.out.println(whatYear(2048));
    }
    
    static boolean checkSum(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }
    
    static void checkSign(int c) {
        System.out.println(c >= 0? "Positive" : "Negative");
    }
    
    static boolean checkNumber(int f) {
        return f < 0; 
    }
    
    static void printName(int b) {
        for (int a = 0; a < b; a++) {
            System.out.println("Name");
        }
    }
    
    static boolean whatYear(int y) {
        return y % 4 == 0 && y % 100 != 0 || y % 400 == 0; 
    }
}