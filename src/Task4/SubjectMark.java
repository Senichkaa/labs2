package Task4;

import Task2.Subjects;

public class SubjectMark {
    private Subjects subjects;
    private Integer mark;

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(final Subjects subjects) {
        this.subjects = subjects;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(final Integer mark) {
        this.mark = mark;
    }

    public SubjectMark(final Subjects subjects, final Integer mark) {
        this.subjects = subjects;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Your mark of subject " + subjects.getNameOfSubject()+" " + "is:" +mark;
    }
}
