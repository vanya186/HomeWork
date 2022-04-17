package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsic", 150, 0);
        System.out.println("cat:" + cat.getName() + " " + "run:->" + cat.getRun() + " " + "swim:->" + cat.getSwim());

        Animal dog = new Dog("Bobic", 400, 8);
        System.out.println("dog:" + dog.getName() + " " + "run:->" + dog.getRun() + " " + "swim:->" + dog.getSwim());
    }
}
