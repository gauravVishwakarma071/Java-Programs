class Student{

    String name;
    int age; //normal variable that can be accessed by instance of the class
    static String collage = "VBSPU"; // Static variable that can be call by class
    static int count = 0;



    Student(String name, int age){
        this.name = name;
        this.age = age;
        count++;
    }

    Student(){
        count++;
    }

    //static method 
    public static void totalStudent(){
        System.out.println(count);
    }
    void totalqStudent(){
        System.out.println(count);
    }

}

public class StaticEx_1{
    public static void main(String[] args) {
        Student s1 = new Student("gaurav",23);
        //Student s2 = new Student();
        //Student s3 = new Student();

        //static variable called
        System.out.println(Student.count);
        //static variable called
        System.out.println(Student.collage);

        //static function called
        Student.totalStudent();
        //normal function called
        s1.totalqStudent();
        System.out.println(s1.name +" "+s1.age);
    }    
}