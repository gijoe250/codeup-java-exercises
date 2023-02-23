package grades;

public class StudentTest {
    public static void main(String[] args){
        Student student1 = new Student("Joe");
        System.out.println(student1.getName());
        student1.addGrade(21);
        student1.addGrade(24);
        student1.addGrade(12);
        student1.addGrade(4);
        student1.addGrade(8);
        System.out.println(student1.getGradeAverage());
    }
}
