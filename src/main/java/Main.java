public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Черный", 6);
        Dog dog = new Dog("Шарик", "Рыжий", 5);
        Fish fish = new Fish("Немо", "Красный", 1);
        System.out.println("И сотворил программист тварей: " + Animal.count);
        cat.info();
        dog.info();
        fish.info();

        System.out.println("--------------------------------------");

        cat.run(300);
        dog.run(250);
        fish.run(10);//ЭВОЛЮЦИЯ!!

        System.out.println("**************************************");

        cat.swimming(5);
        dog.swimming(10);
        fish.swimming(800);
        fish.swimming();

    }
}
