import java.util.List;
import java.util.ArrayList;

public class Aufgabe5 {



    public static void main (String[]args){


        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Kilian ", 1710653657,2018));
        studentList.add(new Student("Nico ", 1810653657,2018));
        studentList.add(new Student("Seppe ", 1810653965,2018));

        for (Student s: studentList){
            System.out.println(s);
        }
    }
}
