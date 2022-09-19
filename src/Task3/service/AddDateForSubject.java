package Task3.service;

import Task2.Group;
import Task2.Subjects;

import java.security.InvalidParameterException;
import java.time.LocalDate;

public class AddDateForSubject {

    public static void addDate(final Group group, final Subjects subject, final LocalDate date) {
        for (final Subjects subjects : group.getSubjects()) {
            if (subjects.equals(subject)) {
                subject.getDate().add(date);
            }
        }
    }
    public static void addDate(final Group group, final String subjectName, final String date) {
        final Subjects subjectByName = getSubjectByName(group, subjectName);
        subjectByName.getDate().add(LocalDate.parse(date));
    }
    public static Subjects getSubjectByName(final Group group, final String subjectName) {
        for (final Subjects subjects : group.getSubjects()) {
            if (subjects.getNameOfSubject().equals(subjectName)) {
                return subjects;
            }
        }
        throw new InvalidParameterException("Not found name of " + subjectName + "for" + group.getNameOfGroup());
    }
}


