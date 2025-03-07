class Student {
    int rollNo;
    String name;
    static String college = "IIT";  // Static variable

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void collegeName(){
        System.out.println(college);
    }
    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}

public class Static_2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Gaurav");
        Student s2 = new Student(2, "Amit");

        s1.display();
        s2.display();

        // Changing static variable
        Student.college = "NIT";

        s1.display();
        s2.display();
        System.out.println(Student.college);
        Student.collegeName();
    }
}

