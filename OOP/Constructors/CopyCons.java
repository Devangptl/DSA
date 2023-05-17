public class CopyCons {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Devang";
        s1.roll = 22;
        s1.password = 12333;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);

        s2.password = 454545;

        s1.marks[2] = 200;

        System.out.println("s2 marks");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        System.out.println("s1 marks");
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }

    }
}

class Student {
    String name;
    int roll;
    int password;
    int marks[];

    // deep copy Constructor
    // Student(Student s1) {

    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;

    // }

    // Shallow cpoy Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student() {
        marks = new int[3];
        System.out.println("constructor...");
    }

    void setStudent(String name) {
        marks = new int[3];
        this.name = name;
    }

    void setRollNo(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
