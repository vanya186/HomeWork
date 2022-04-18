package HomeWork6;

public class Dog  extends Animal {
    private static int count;

    public Dog(String name, int speed_limit, int swim_limit) {
        super(name, speed_limit, swim_limit);
        count++;
    }

    public static int getCount() {
        return count;
    }
}