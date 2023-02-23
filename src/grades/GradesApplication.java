package grades;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();

        Student student1 = new Student("Joe");
        Student student2 = new Student("Alexia");
        Student student3 = new Student("Fernando");
        Student student4 = new Student("Jona");

        student1.addGrade(20);
        student1.addGrade(45);
        student1.addGrade(100);

        student2.addGrade(95);
        student2.addGrade(90);
        student2.addGrade(100);

        student3.addGrade(85);
        student3.addGrade(95);
        student3.addGrade(100);

        student4.addGrade(90);
        student4.addGrade(90);
        student4.addGrade(100);

        students.put("gijoe250", student1);
        students.put("deathByZelda", student2);
        students.put("sunglasses420", student3);
        students.put("farmingMillionaire5k", student4);

        System.out.println(students.keySet());

        while (true){
            System.out.println("Enter one of the mention githubUserNames if you would like to see more information about that user");
            Scanner in = new Scanner(System.in);
            String userName = in.next();
            if (students.containsKey(userName)){
                Student tempStudent = students.get(userName);
                System.out.println(tempStudent.getName());
                System.out.println(tempStudent.getGrades());
                System.out.println(tempStudent.getGradeAverage());
            }else {
                System.out.println("No users with that username exist");
            }
            System.out.println("Enter yes if you want to view all the grades for all the students");
            if (in.next().toLowerCase().equals("yes")){
                for (Map.Entry<String, Student> student : students.entrySet()){
                    Student tempStudent = student.getValue();
                    System.out.println(tempStudent.getName() + "'s grades are: " + tempStudent.getGrades());
                }
            }

            System.out.println("Enter yes if you want to view the class grade average");
            if (in.next().toLowerCase().equals("yes")){
                int sum = 0;
                int length = 0;
                for (Map.Entry<String, Student> student : students.entrySet()){
                    Student tempStudent = student.getValue();
                    length += tempStudent.getGrades().size();
                    for (int grade : tempStudent.getGrades()){
                        sum += grade;
                    }
                }
                System.out.println( (double) sum/length);
            }

            System.out.println("Enter yes if you want a cvs print out");
            if (in.next().toLowerCase().equals("yes")){
                System.out.println("name,github_username,average");
                for (Map.Entry<String, Student> student : students.entrySet()){
                    Student tempStudent = student.getValue();
                    System.out.printf("""
                            %s,%s,%.2f\n""",tempStudent.getName(), student.getKey(), tempStudent.getGradeAverage());
                }

            }

            System.out.println("Enter yes if you would like to continue");
            if (in.next().toLowerCase().equals("yes")){
                continue;
            }
            break;
        }
    }
}
