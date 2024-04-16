package pckg_UML;

public class Student extends Person{

    public Student(String name, String surName) {

        super(name, surName);
        System.out.println(this.getClass() + " constructor called");
    }



    public void asksQuestion() {
        System.out.println("Student: " + this.name + " ask question!");
    }
}
