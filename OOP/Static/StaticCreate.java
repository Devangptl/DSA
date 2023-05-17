public class StaticCreate {
    public static void main(String[] aegs) {

        Animal a1 = new Animal();
        a1.color = "brown";
        a1.StudentName = "cow";

        Animal a2 = new Animal();

        Animal a3 = new Animal();
        a3.StudentName = "fish";
        System.out.println(a3.StudentName);

        System.out.println(a2.StudentName);
    }
}

class Animal {
    String color;

    static String StudentName;

    void setColor(String color) {
        this.color = color;
    }

    String getColor() {
        return this.color;
    }
}