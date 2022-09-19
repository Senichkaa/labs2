package Task2;


import java.util.List;

public class University {
    private String nameOfUniversity;
    private List<Group> groups;

    public String getNameOfUniversity() {
        return nameOfUniversity;
    }

    public void setNameOfUniversity(final String nameUniversity) {
        this.nameOfUniversity = nameUniversity;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(final List<Group> groups) {
        this.groups = groups;
    }

    public University(final String nameOfUniversity, final List<Group> groups) {
        this.nameOfUniversity = nameOfUniversity;
        this.groups = groups;
    }

    @Override
    public String toString() {
        return "University{" +
                "nameOfUniversity='" + nameOfUniversity + '\'' +
                ", groups=" + groups +
                '}';
    }
}
