class Student{
    int id;

    Student (int id){
        this.id = id;
    }
    
}

public class ObjectCloning {
    public static void main(String[] args) {
        Student s1 = new Student(110);

        s1.id = 111;


        Student s2 = s1;
        System.out.println(s1.id);
        System.out.println(s2.id);
    }
}
