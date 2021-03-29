package Classes;

import Comparators.SortByMark;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class StudentsCollection implements Serializable {
    private static final long serialVersionUID = 8L;
    private List<Students> studentsCollection = new ArrayList<Students>();

    public void addStudent(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Student: id, lastname, name, group, department, discipline, mark, teacher");
        Students student = new Students(
                parseInt(scanner.nextLine()),
                scanner.nextLine(),
                scanner.nextLine(),
                parseInt(scanner.nextLine()),
                scanner.nextLine());

        student.setDiscipline(scanner.nextLine());
        student.setMark(parseInt(scanner.nextLine()));
        student.setNameTeacher(scanner.nextLine());
        studentsCollection.add(student);
    }

    public void sortByMark(){
        Collections.sort(studentsCollection, new SortByMark());
    }

    @Override
    public String toString() {
        String text = new String("Orders collection :\n");
        for(Students stc : studentsCollection){
            text+=stc.toString()+"\n";
        }
        return text;
    }

    public List<Students> getStudentsCollection() {
        return studentsCollection;
    }
}
