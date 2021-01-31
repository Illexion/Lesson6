public class Fish extends Animal {

    public Fish(String name, String color, int age) {
        super(name, color, age);
    }

    public void swimming() {
        System.out.println("Бульк");
    }

    @Override
    public void run() {
        System.out.println("Я не умею бегать");
    }
}
