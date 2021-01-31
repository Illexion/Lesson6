
public  class Dog extends Animal {
    int maxDist = 500;
    public Dog(String name, String color, int age) {
        super(name, color, age);
    }

    public void info() {
        System.out.println(name + " пес");
        super.info();
    }


    public void run(int distance) {
        if(distance <= maxDist){
            System.out.println("Ruuuuuun!" + distance);
        } else {
            System.out.println("Собаки столько не могут пробежать!");
        }
    }


}
