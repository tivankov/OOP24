package pckg_UML;

public class MainApp {

    public static void main(String[] args) {
        Person person = new Person("Matija", "Martinić");
        Student stud = new Student("Student", "ewg");
        Profesor prof = new Profesor("Prof", "Prezime");
        prof.setStudent(stud);
        prof.performConsultation();
    }
}
