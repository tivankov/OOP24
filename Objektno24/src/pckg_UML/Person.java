package pckg_UML;

public class Person {

    protected String name;
    protected String surname;
    protected int ID;
    protected static int cntID = 100;

    public Person(String name, String surName){
        this.ID = cntID++;
        this.name = name;
        this.surname = surname;
        System.out.println(this.getClass() + " constructor called");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", ID=" + ID +
                '}';
    }
}
