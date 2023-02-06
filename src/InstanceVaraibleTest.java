
class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    Student(){
        System.out.println("creating student object usng default constructor");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class InstanceVaraibleTest {

    public static void main(String[] args) {
        Student s1= new Student(10,"meh");
        Student s2= new Student(20,"sud");
        Student s3= new Student(); //jvm will provide default values
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3); //check the o/p here

        System.out.println(s1.id);
        System.out.println(s1.name);

        System.out.println(s2.id);
        System.out.println(s2.name);


    }

}
