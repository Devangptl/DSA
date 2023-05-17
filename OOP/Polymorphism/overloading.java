public class overloading {

    public static void main(String[] args) {

        Claculater cl = new Claculater();

        System.out.println(cl.Sum(25, 25));
        System.out.println(cl.Sum((float) 2.5, (float) 2.5));
        System.out.println(cl.Sum(25, 25, 25));

    }
}

class Claculater {
    int Sum(int a, int b) {
        return a + b;
    }

    float Sum(float a, float b) {
        return a + b;
    }

    int Sum(int a, int b, int c) {
        return a + b + c;
    }
}