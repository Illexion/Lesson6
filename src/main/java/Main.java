public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Черный",6);
        Dog sharikDog = new Dog("Шарик","Рыжий",5);
        Fish fish = new Fish("Немо","Красная",1);
        cat.info();
        sharikDog.run(10);
        cat.run();
        fish.info();
    }
}
