package Task3.service;

import Task2.Group;
import Task2.Subjects;
import Task2.University;

public class AddSubject {
    final private Subjects subject;
    public AddSubject(final Subjects subject) {
        this.subject = subject;
    }
    public void adding (final University university, final String nameOfGroup){
        for (final Group group : university.getGroups()) {
            if (group.getNameOfGroup().equals(nameOfGroup)){
                group.getSubjects().add(subject);
            }
        }
    }
}
