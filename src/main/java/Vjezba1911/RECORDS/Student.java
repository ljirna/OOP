package Vjezba1911.RECORDS;
import java.util.List;
public record Student(int studentID, String name, double Grade) {
}
class StudentAnalyzer{
    public static double findAverageGrade(List<Student> students){
        return students.stream()
                .mapToDouble(a -> a.Grade())
                .sum();
    }
}
class MainThree{
    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student(1, "John Doe", 85.5),
                new Student(2, "Jane Smith", 92.0),
                new Student(3, "Sam Johnson", 78.3)
        );

        System.out.println(
                StudentAnalyzer.findAverageGrade(studentList)
        );
    }
}