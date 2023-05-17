public class Overriding {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("eat Anithing");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eat vegitables");
    }
}