package Week10.Lab;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Student {
    private int ID;
    private String name;
    private List<Double> grades;
    public Student(int ID, String name, List<Double> grades){
        this.ID = ID;
        this.name = name;
        this.grades = grades;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }
    public void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Grades: " + grades);
    }
}
class GradeAnalyzer{
    private List<Double> grades;
    public GradeAnalyzer(List<Double> grades){
        this.grades = grades;
    }
    public double printSum(){
        double sum = 0.0;
        for(int i = 0; i < grades.size(); i++){
            sum+=i;
        }
        return sum;
    }
    public void returnAverage(){
        double sum = printSum();
        double average = sum/this.grades.size();
        System.out.println("Average is: " + average);
    }
}
class MainS {
    public static void main(String[] args) {
        // Instantiate a GradeAnalyzer object with a list of grades
        List<Double> gradesList = Arrays.asList(85.5, 90.0, 78.5, 92.5);
        GradeAnalyzer analyzer = new GradeAnalyzer(gradesList);

        // Use reflection to access and print the field names and values of the GradeAnalyzer class
        Class<?> analyzerClass = analyzer.getClass();
        Field[] fields = analyzerClass.getDeclaredFields();
        System.out.println("Fields of GradeAnalyzer class:");
        for (Field field : fields) {
            field.setAccessible(true);
            try {
                System.out.println(field.getName() + ": " + field.get(analyzer));
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }

        // Iterate through the declared methods and invoke those whose names start with "calculate" or "print"
        Method[] methods = analyzerClass.getDeclaredMethods();
        System.out.println("\nInvoking methods:");
        for (Method method : methods) {
            if (method.getName().startsWith("calculate") || method.getName().startsWith("print")) {
                System.out.println("Method: " + method.getName());
                try {
                    Object result = method.invoke(analyzer);
                    if (result != null) {
                        System.out.println("Result: " + result);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}