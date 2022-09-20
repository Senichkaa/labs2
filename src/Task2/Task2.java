package Task2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task2 {
    public static University createUniversity() {

        final List<Group> groups = new ArrayList<>();

        final String nameOfGroup = "IT-21";
        final String specialisationOfGroup = "Information systems and technologies";
        final List<Student> studentsOfGroup = Stream.of(
                new Student("Arsen Kapanaiko", specialisationOfGroup, nameOfGroup),
                new Student("Roksolana Protsiv", specialisationOfGroup, nameOfGroup),
                new Student("Oleksandr Gamaiunov", specialisationOfGroup, nameOfGroup),
                new Student("Arsen Lisnytchuk", specialisationOfGroup, nameOfGroup)
        ).collect(Collectors.toList());
        groups.add(new Group(nameOfGroup, studentsOfGroup, Stream.of(
                new Subjects("Programming and team work", new HashMap<Student, Integer>(){{
                    put(studentsOfGroup.get(0), 66);
                    put(studentsOfGroup.get(1), 86);
                    put(studentsOfGroup.get(2), 60);
                    put(studentsOfGroup.get(3), 70);
                }}, Stream.of(
                        LocalDate.of(2021, 4, 5),
                        LocalDate.of(2021, 4, 7),
                        LocalDate.of(2021, 4, 11)
                ).collect(Collectors.toList())
                ),
                new Subjects("Probability theory", new HashMap<Student, Integer>(){{
                    put(studentsOfGroup.get(0), 77);
                    put(studentsOfGroup.get(1), 98);
                    put(studentsOfGroup.get(2), 88);
                    put(studentsOfGroup.get(3), 99);
                }}, Stream.of(
                        LocalDate.of(2022, 9, 2),
                        LocalDate.of(2022, 9, 13)
                ).collect(Collectors.toList()))
        ).collect(Collectors.toList())
        ));

        return new University("Lviv Polytechnic National University", groups);
    }

    public static void main(final String[] args) {
        final University university = createUniversity();
        System.out.println(university);
    }
}