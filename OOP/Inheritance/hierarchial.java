public class hierarchial {
    public static void main(String[] args) {

        Mammals m = new Mammals();
        m.walk();
        m.breathe();

        Fish f = new Fish();
        f.breathe();
        f.swim();

    }
}

class Animal {
    String color;

    void breathe() {
        System.out.println("breathing...");
    }

}

class Mammals extends Animal {
    void walk() {
        System.out.println("walk...");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swimming ...");
    }
}
