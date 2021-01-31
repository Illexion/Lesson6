public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run() {
        System.out.println("Тыгыдык");
    }
}
