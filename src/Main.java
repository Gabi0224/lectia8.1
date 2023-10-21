import om.Person;
import om.Student;
import om.Stuff;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAddress("Bucuresti 81");
        System.out.println("Name = Gabi");
        Person.afisareInfo();
        System.out.println("------------------");

        Student student = new Student();
        student.setFee(22000);
        student.setProgram("java");
        student.setYear(2000);
        System.out.println("Name = Anghelina");
        System.out.println("Address = Puskin 55");
        Student.afisareInfo();
        System.out.println("-------------------");

        Stuff stuff = new Stuff();
        stuff.setPay(25.9876654);
        stuff.setSchool("Asachi");
        System.out.println("Name = Echipa");
        System.out.println("Negureni = 21");
        Stuff.afisareInfo();
    }
}