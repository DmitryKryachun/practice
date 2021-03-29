package Comparators;

import Classes.Contact;
import Classes.Students;

import java.util.Comparator;

public class SortByMark implements Comparator<Students> {
    @Override
    public int compare(Students students, Students t1) {
        return new Integer(students.getMark()).compareTo(new Integer(t1.getMark()));
    }
}
