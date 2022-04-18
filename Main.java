package HomeWork6;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Barsic", 200, 0);
        System.out.println(
                "cat:" + cat.getName() + " " +
                "run:->" + cat.getSpeed_limit() + " " +
                "swim:->" + cat.getSwim_limit()
        );
        System.out.println(
                "cat:" + cat.getName() + " " +
                "run:->" + cat.run(150) + " " +
                "swim:->" + cat.swim(5)
        );
        System.out.println("Total cats created: " + Cat.getCount());

        Animal dog = new Dog("Bobic", 500, 10);
        System.out.println(
                "dog:" + dog.getName() + " " +
                "run:->" + dog.getSpeed_limit() + " " +
                "swim:->" + dog.getSwim_limit()
        );
        System.out.println(
                "dog:" + dog.getName() + " " +
                "run:->" + dog.run(400) + " " +
                "swim:->" + dog.swim(11)
        );
        System.out.println("Total dogs created: " + Dog.getCount());

        System.out.println("Total animals Created: " + Animal.getCount());
    }
}
