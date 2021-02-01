public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    static int count = 0;
    int maxDistRun;
    int maxDistSwim;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public void info() {
        System.out.println("Имя: " + name + ", Цвет: " + color + ", Возраст " + age);

    }

    public void run(int distance) {

        System.out.println("Предел животного в беге - " + name + " " + maxDistRun);
        System.out.println("Надо пробежать: "+ distance);

        if (distance <= maxDistRun) {
            System.out.println(name + " Ruuuuuun! " + distance);
        } else {
            System.out.println(name + " столько не может пробежать!");
        }
        System.out.println("--------------------------------------");

    }

    public void swimming(int distance) {

        System.out.println("Предел животного в плавании - " + name + " " + maxDistSwim);
        System.out.println("Надо проплыть: "+ distance);
        if (distance <= maxDistSwim) {
            System.out.println(name + " Swiiiiiiiim! " + distance);
        } else {
            System.out.println(name + " столько не может проплыть!");
        }
        System.out.println("--------------------------------------");
    }

    public void setMaxDistRun(int maxDist) {
        this.maxDistRun = maxDist;
    }

    public void setMaxDistSwim(int maxDist) {
        this.maxDistSwim = maxDist;
    }
}
