package Task4;

import Task2.Group;
import Task2.Student;
import Task2.Subjects;
import Task2.University;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AssessmentJournal {
    private Student student;
    private List<SubjectMark> marks;

    public Student getStudent() {
        return student;
    }

    public void setStudent(final Student student) {
        this.student = student;
    }

    public List<SubjectMark> getMarks() {

        return marks;
    }

    public void setMarks(final List<SubjectMark> marks) {

        this.marks = marks;
    }

    public AssessmentJournal(final Student student, final List<SubjectMark> marks) {
        this.student = student;
        this.marks = marks;
    }

    public void addToMark(final int mark, final String subjectName) {
        final SubjectMark subjectMark = marks.stream().
                filter(e -> e.getSubjects().getNameOfSubject().equals(subjectName)).findFirst().get();
        subjectMark.setMark(subjectMark.getMark() + mark);
    }

    public void minusFromMark(final int mark, final String subjectName) {
        addToMark(-mark, subjectName);
    }

    public void removeMark(final String subjectName){
        final SubjectMark subjectMark = marks.stream().
                filter(e -> e.getSubjects().getNameOfSubject().equals(subjectName)).findFirst().get();
        final int index = marks.indexOf(subjectMark);

        marks.remove(index);
    }

    public static List<AssessmentJournal> marksOfAllStudents(final University university){
        final List<AssessmentJournal> assessmentJournals = new ArrayList<>();
        for (final Group group : university.getGroups()) {
            for (final Student student : group.getStudents()) {
                final AssessmentJournal newAssessmentJournal = new AssessmentJournal(student,new ArrayList<>());

                group.getSubjects().stream().filter(e -> e.getMarksOfStudent().containsKey(student)).
                        forEach(e -> newAssessmentJournal.getMarks().
                                add(new SubjectMark(e,e.getMarksOfStudent().get(student))));
                assessmentJournals.add(newAssessmentJournal);
            }
        }
        return assessmentJournals;
    }

    public static List<Integer> marksOfAStudent(final Student student,final University university){
        final List<Integer> listOfMarks = new ArrayList<>();
        marksOfAllStudents(university).stream().
                filter(e -> e.student.equals(student)).findFirst().get().marks.
                forEach(e->listOfMarks.add(e.getMark()));

        return listOfMarks;
    }

    public static List<Integer> marksOfASubject(final Subjects subjects,final University university){
        final List<Integer> listOfMarks = new ArrayList<>();
         marksOfAllStudents(university).stream().
                 forEach(e->listOfMarks.add(e.marks.stream().
                         filter(element->element.getSubjects().equals(subjects)).
                         findFirst().get().getMark()));

         return listOfMarks;
    }

    @Override
    public String toString() {
        return "AssessmentJournal{" +
                "student=" + student +
                ", marks=" + marks +
                '}';
    }
}
