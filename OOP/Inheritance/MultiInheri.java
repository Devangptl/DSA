public class MultiInheri {
    public static void main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.lag = 4;
        System.out.println(d1.lag);
        d1.breed = "Bulldog";
        System.out.println(d1.breed);

    }
}

class Animal {
    int color;

    void eat() {
        System.out.println("Eating...");
    }

    void breathe() {
        System.out.println("Breathing...");
    }
}

class Mammals extends Animal {
    int lag;
}

class Dog extends Mammals {
    String breed;
}