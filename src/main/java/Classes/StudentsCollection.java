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

    public void addStudent(int id, String lst, String name, int gr, String dp, String ds, int mark, String teacher){

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Student: id, lastname, name, group, department, discipline, mark, teacher");
        Students student = new Students(
                id,
                lst,
                name,
                gr,
                dp);

        student.setDiscipline(ds);
        student.setMark(mark);
        student.setNameTeacher(teacher);
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
