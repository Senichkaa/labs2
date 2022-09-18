package Task2;

import java.util.List;

public class Group {
    private String nameOfGroup;
    private List<Student> students;
    private List<Subjects> subjects;

    public Group(final String nameOfGroup, final List<Student>students, final List<Subjects>subjects){
        this.nameOfGroup = nameOfGroup;
        this.subjects = subjects;
        this.students = students;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(final String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(final List<Student> students) {
        this.students = students;
    }

    public List<Subjects> getSubjects() {
        return subjects;
    }

    public void setSubjects(final List<Subjects> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        final StringBuilder builder = new StringBuilder();
        builder.append(nameOfGroup).append('\n');
        for (final Subjects subject : subjects) {
            builder.append(subject).append('\n');
        }
        return builder.toString();
    }
}
