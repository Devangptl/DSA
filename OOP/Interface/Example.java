public class Example {
    public static void main(String[] args) {

        Dear d = new Dear();
        d.eatGrass();
        d.eatMeat();

    }
}

interface Harbivore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

class Dear implements Harbivore, Carnivore {
    public void eatGrass() {
        System.out.println("yes....");
    }

    public void eatMeat() {
        System.out.println("no....");
    }
}