public class Hybrid {
    public static void main(String[] args) {

        Dog D = new Dog();
        D.lag = 4;
        D.hunting();

        Peacock p = new Peacock();
        p.fly();
        p.nationalAnimal();
        p.breathe();

        Shark s = new Shark();
        s.color = "Blue";
        s.size();
        s.swim();

    }
}

class Animal {
    String color;

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

class Bird extends Animal {
    void fly() {
        System.out.println("flying...");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("swiming...");
    }
}

// Mammals
class Dog extends Mammals {
    void hunting() {
        System.out.println("Dog is Hunting");
    }
}

class Human extends Mammals {
    void Speaking() {
        System.out.println("Human is speaking..");
    }
}

// Bird
class Peacock extends Bird {
    void nationalAnimal() {
        System.out.println("Namtional Animal...");
    }
}

// Fish
class Shark extends Fish {
    void size() {
        System.out.println("Shark size is big");
    }
}
