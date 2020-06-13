package ru.job4j.streambetter.filterstudent;

import java.util.Comparator;

public class StudentByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getSurname().compareTo(o2.getSurname());
    }
}
