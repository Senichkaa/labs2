package Task3.service;

import Task2.Group;
import Task2.Student;
import Task2.Subjects;
import Task2.University;

import java.util.ArrayList;
import java.util.List;

public class StudentSubject {
    public static List<Student> studentSubject(final String subjectName, final Group group) {
        final List<Student> students = new ArrayList<>();
        for (final Subjects s : group.getSubjects()) {
            if (s.getNameOfSubject().equals(subjectName)) {
                students.addAll(s.getMarksOfStudent().keySet());
                return students;
            }
        }
        return students;
    }
}

