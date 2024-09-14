package springFramework.model;

public class Person {
    int age;
    Student student;

    Person() {
        System.out.println("Person Object Created");
    }

    public Person(int age) {
        this.age = age;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
        student.talk();
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void walk() {
        System.out.println("I am walking");
    }
}
