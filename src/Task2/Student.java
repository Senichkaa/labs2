package Task2;

import java.util.Objects;

public class Student {
    private String nameOfStudent;
    private String group;
    private String speciality;

    public Student(final String nameOfStudent, final String speciality, final String group) {
        this.nameOfStudent = nameOfStudent;
        this.speciality = speciality;
        this.group = group;
    }

    public String getNameOfStudent() {
        return nameOfStudent;
    }

    public void setNameOfStudent(final String nameOfStudent) {
        this.nameOfStudent = nameOfStudent;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(final String group) {
        this.group = group;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(final String speciality) {
        this.speciality = speciality;
    }

    @Override
    public String toString() {
        return  nameOfStudent +"," + group + "," + speciality;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Student student = (Student) o;
        return Objects.equals(nameOfStudent, student.nameOfStudent) && Objects.equals(group, student.group) && Objects.equals(speciality, student.speciality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfStudent, group, speciality);
    }
}

