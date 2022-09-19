package Task3.service;

import Task2.Student;
import Task2.University;

import java.util.Comparator;
import java.util.List;

public class SortingStudents {
    final private University university;

    public SortingStudents(final University university) {
        this.university = university;
    }

    public void outputStudentsByAlphabet(final String nameOfGroup) {
        final List<Student> students = university.getGroups().stream().filter(
                group -> group.getNameOfGroup().equals(nameOfGroup)
        ).findFirst().get().getStudents();

        students.sort(Comparator.comparing(Student::getNameOfStudent));

        students.forEach(System.out::println); //по-молодіжному
        System.out.println();
    }

}
