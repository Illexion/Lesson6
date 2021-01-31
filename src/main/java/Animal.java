public abstract class Animal {
    protected String name;
    protected String color;
    protected int age;
    protected int dist;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public void info() {
        System.out.println("Имя: " + name + ", Цвет: " + color + ", Возраст " + age);

    }
    public void run(){

    }
}
