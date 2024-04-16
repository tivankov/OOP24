package pckg_UML;

import java.util.ArrayList;

public class Profesor extends Person{

    private ArrayList<Student> students;

    public Profesor(String name, String surName) {

        super(name, surName);
        students = new ArrayList<>();
        System.out.println(this.getClass() + " constructor called");
    }

    public void setStudent(Student student) {
//        this.student = student;
    }
    public void performConsultation(){
        System.out.println(this.getClass().getSimpleName() + " Gives consultive lectiring. ");
        for(Student student : students)
        student.asksQuestion();
    }
}
