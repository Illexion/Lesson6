public class Cat extends Animal {

    int maxDistRun = 200;
    int maxDistSwim = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }

    @Override
    public void run(int distance) {
        super.setMaxDistRun(maxDistRun);
        super.run(distance);
    }

    @Override
    public void swimming(int distance) {
        super.setMaxDistSwim(maxDistSwim);
        super.swimming(distance);
    }
}
