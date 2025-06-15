package LAB7;

public class mySeventhApp {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "Warsaw", 1994);
        person.growOld(5);
        person.beYounger();
        System.out.println(person.getName() + " is now " + person.getAge());
    }
}
