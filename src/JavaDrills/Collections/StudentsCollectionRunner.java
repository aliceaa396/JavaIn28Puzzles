package JavaDrills.Collections;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class AscStudentComp implements Comparator <Student> {

    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getId(), student2.getId());
    }
}

public class StudentsCollectionRunner {
    public static void main(String[] args) {
        List<Student> students = List.of(new Student(1,"Angel"),new Student(3, "Brendan"), new Student(2,"Hawke"));
        ArrayList<Student> studentsAl = new ArrayList<>(students);

        System.out.println(studentsAl);

        Collections.sort(studentsAl);
        System.out.println("Desc Order: " + studentsAl);

        Collections.sort(studentsAl, new AscStudentComp());
        System.out.println("Asc Order: " + studentsAl);


    }
}
