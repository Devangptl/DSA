public class create {
    public static void main(String[] args) {

        Student s1 = new Student();

        // System.out.println(s1.name);

    }
}

class Student {
    String name;
    int erNo;

    Student() {
        // this.name = name;
        System.out.println("Constructors is use...");
    }
}