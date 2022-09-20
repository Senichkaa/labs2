package Task4;

import Task2.*;


public class Task4 {
    public static void main(final String[] args) {
        final University university = Task2.createUniversity();
        System.out.println(university);

        AssessmentJournal.marksOfAllStudents(university).
                forEach(System.out::println);
        System.out.println();
        AssessmentJournal.marksOfAStudent(university.getGroups().get(0).getStudents().get(1),university).
                forEach(System.out::println);
        System.out.println();
        AssessmentJournal.marksOfASubject(university.getGroups().get(0).getSubjects().get(1),university).
                forEach(System.out::println);
        System.out.println();




    }

}
