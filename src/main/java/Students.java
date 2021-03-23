public class Students {

    private int idStudent;
    private String lastName;
    private String firstName;
    private int group;
    private String department;
    private String discipline;
    private int mark;
    private String nameTeacher;

    public Students(int idStudent, String lastName, String firstName, int group, String department) {
        this.idStudent = idStudent;
        this.lastName = lastName;
        this.firstName = firstName;
        this.group = group;
        this.department = department;
    }

    public int getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    @Override
    public String toString() {
        return "Students{" +
                "idStudent=" + idStudent +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", group=" + group +
                ", department='" + department + '\'' +
                ", discipline='" + discipline + '\'' +
                ", mark=" + mark +
                ", nameTeacher='" + nameTeacher + '\'' +
                '}';
    }
}
