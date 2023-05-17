import javax.print.attribute.standard.MediaSize.NA;

public class typeOfCon {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Devang Patel");
        Student s3 = new Student("Devang Patel", 042);

        System.out.println(s2.Name);
        System.out.println(s3.Name);
        System.out.println(s3.ErNo);

    }
}

class Student {
    String Name;
    int ErNo;

    // NON Parameterized Constructor and Defult Constructor
    Student() {
        System.out.println("NON Parameterized Constructor...");
    }

    // Parameterized Constructor
    Student(String Name) {
        this.Name = Name;
    }

    Student(String Name, int ErNo) {
        this.Name = Name;
        this.ErNo = ErNo;
    }
}
