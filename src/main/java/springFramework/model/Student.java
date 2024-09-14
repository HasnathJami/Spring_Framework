package springFramework.model;

public class Student {
    int studentId;
    int studentAge;

    Student(){

    }
    void talk() {
        System.out.println("I am student");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }
}
