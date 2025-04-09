
//Deep Cloning --> copies all values of the field from the Object and provide an independent copy of an Object. 
public class DeepObjectCloning {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("jaunpur");
        Student s1 = new Student("gaurav", addr);

        Student s2 = (Student) s1.clone(); // Cloning s2 from s1.

        s2.name = "akash";
        s2.address.city = "varansi";
        System.out.println(s1.name + " " + s1.address.city);
        System.out.println(s2.name + " " + s2.address.city);

    }
}

class Address implements Cloneable {
    String city;

    Address(String city) {
        this.city = city;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}

class Student implements Cloneable {
    String name;
    Address address;

    Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Object clone() throws CloneNotSupportedException {
        Student cloned = (Student) super.clone();
        cloned.address = (Address) address.clone();// Deep Cloning.
        return cloned;
    }
}