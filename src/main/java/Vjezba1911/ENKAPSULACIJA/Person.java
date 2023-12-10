package Vjezba1911.ENKAPSULACIJA;

enum Gender{
    MALE, FEMALE
}
public class Person {
    private String name;
    private int age;
    private String address;
    private Gender gender;
    public Person(String name, int age, String address, Gender gender){
        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
class Student extends Person{
    private int studentID;
    private int grade;
    public Student(Gender gender, String name, int age, String address, int studentID, int grade){
        super(name, age, address, gender);
        this.grade= grade;
        this.studentID=studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
class MainTwo {
    public static void main(String[] args) {
        Person person = new Person("John Doe", 25, "123 Main St", Gender.MALE);

        // Display details of the Person
        System.out.println("Details of Person:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Address: " + person.getAddress());
        System.out.println("Gender: " + person.getGender());

        // Create a Student
        Student student = new Student(Gender.MALE, "Marko", 23, "BLABLA", 123, 10);

        // Display details of the Student
        System.out.println("\nDetails of Student:");
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Address: " + student.getAddress());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Student ID: " + student.getStudentID());
        System.out.println("Grade: " + student.getGrade());
    }
}