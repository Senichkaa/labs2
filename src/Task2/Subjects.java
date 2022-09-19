package Task2;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public class Subjects {
    private String nameOfSubject;
    private Map<Student, Integer> marksOfStudent;
    private List<LocalDate> date;

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(final String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public Map<Student, Integer> getMarksOfStudent() {
        return marksOfStudent;
    }

    public void SetMarksOfStudent(final Map<Student, Integer> marksOfStudent) {
        this.marksOfStudent = marksOfStudent;
    }

    public List<LocalDate> getDate() {
        return date;
    }

    public void setDate(final List<LocalDate> date) {
        this.date = date;
    }

    public Subjects(final String nameOfSubject, final Map<Student, Integer> marksOfStudent, final List<LocalDate> date) {
        this.nameOfSubject = nameOfSubject;
        this.marksOfStudent = marksOfStudent;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "nameOfSubject='" + nameOfSubject + '\'' +
                ", marksOfStudent=" + marksOfStudent +
                ", date=" + date +
                '}';
    }
}
