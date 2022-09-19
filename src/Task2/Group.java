package Task2;

import java.util.List;
import java.util.Objects;

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
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Group group = (Group) o;
        return Objects.equals(nameOfGroup, group.nameOfGroup) && Objects.equals(students, group.students) && Objects.equals(subjects, group.subjects);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfGroup, students, subjects);
    }

    @Override
    public String toString() {
        return "Group{" +
                "nameOfGroup='" + nameOfGroup + '\'' +
                ", students=" + students +
                ", subjects=" + subjects +
                '}';
    }
}
