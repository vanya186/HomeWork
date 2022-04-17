package HomeWork6;

abstract class Animal {
    private String name;
    private int run;
    private int swim;
    private final int max_run = 0;
    private final int max_swim = 0;

    public Animal(String name, int run, int swim) {
        this.name = name;
        this.run = run;
        this.swim = swim;
    }

    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }
}

