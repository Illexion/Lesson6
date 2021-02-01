public  class Dog extends Animal {

    int maxDistRun = 500;
    int maxDistSwim = 10;

    public Dog(String name, String color, int age) {
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
