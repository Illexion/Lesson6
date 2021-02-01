public class Fish extends Animal {
    int maxDistSwim = 999999;

    public Fish(String name, String color, int age) {
        super(name, color, age);
    }

    public void swimming() {
        System.out.println("Бульк");
    }
    @Override
    public void run(int distance) {
        System.out.println("Рыбы не бегают...обычно");
    }

    @Override
    public void swimming(int distance) {
        super.setMaxDistSwim(maxDistSwim);
        super.swimming(distance);
    }

}
