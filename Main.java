package HomeWork7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Barsik", 200),
                      new Cat("Lokki", 100),
                      new Cat("Ryzhyk", 60)};

        Plate plate = new Plate(100);
            for (Cat cat : cats) {
            System.out.println(cat);
        }

        System.out.println("\n" + plate);
        System.out.println("Increase food by 100");
        plate.increaseFood(100);
        System.out.println(plate);
        System.out.println("Cats take food:");
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
            System.out.println(plate);
        }

    }
}
