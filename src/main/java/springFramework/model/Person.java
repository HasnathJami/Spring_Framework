package springFramework.model;

public class Person {
    int age;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    Student student;
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    Person() {
        System.out.println("Person Object Created");
    }

    public void walk() {
        System.out.println("I am walking");
    }
}
