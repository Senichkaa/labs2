package Task3;

import Task2.Task2;
import Task2.*;
import Task3.service.AddDateForSubject;
import Task3.service.AddSubject;
import Task3.service.SortingStudents;
import Task3.service.StudentSubject;

import java.util.ArrayList;
import java.util.HashMap;


public class Task3 {
    public static void main(final String[] args) {

        final University university = Task2.createUniversity();
        System.out.println(university);

        AddDateForSubject.addDate(university.getGroups().get(0),
                "Programming and team work","2022-10-05");
        System.out.println(university);

        StudentSubject.studentSubject(
                "Probability theory",university.getGroups().get(0)).forEach(System.out::println);
        System.out.println();

        final SortingStudents sortingStudents = new SortingStudents(university);
        sortingStudents.outputStudentsByAlphabet("IT-21");

        final AddSubject addSubject = new AddSubject(new Subjects("Discret Math", new HashMap<Student, Integer>(),new ArrayList<>()));
        addSubject.adding(university,"IT-21");

        System.out.println(university);

    }
}
