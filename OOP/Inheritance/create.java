public class create {
    public static void main(String[] args) {

        Tiger t1 = new Tiger();

        t1.color = "Brown";
        System.out.println(t1.color);
        t1.eat();
        t1.Run();
        t1.lag = 4;
        System.out.println("Tiger lag " + t1.lag);

    }
}

// perent class / base class
class Animal {
    String color;

    void eat() {
        System.out.println("Animal eating");
    }

    void speak() {
        System.out.println("Animal Speaking");
    }
}

// child class / Derived class

class Tiger extends Animal {
    int lag;

    void Run() {
        System.out.println("Tiger running");
    }
}
