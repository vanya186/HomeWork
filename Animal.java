package HomeWork6;

abstract class Animal {
    private String name;
    private int speed_limit;
    private int swim_limit;
    static int count;

    public Animal(String name, int speed_limit, int swim_limit) {
        this.name = name;
        this.speed_limit = speed_limit;
        this.swim_limit = swim_limit;
        count++;
    }


    public static int getCount() {
        return count;
    }

    public boolean run(int speed) {
        return speed <= speed_limit;
    }

    public boolean swim(int distance) {
        return distance <= swim_limit;
    }

    public String getName() {
        return name;
    }

    public int getSpeed_limit() {
        return speed_limit;
    }

    public int getSwim_limit() {
        return swim_limit;
    }
}

