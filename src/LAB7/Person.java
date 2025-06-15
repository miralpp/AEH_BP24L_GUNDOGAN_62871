package LAB7;

public class Person {
    private String name;
    private int age;
    private String address;
    private int yearOfBirth;

    public Person(String name, int age, String address, int yearOfBirth) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.yearOfBirth = yearOfBirth;
    }

    public void growOld(int years) {
        age += years;
    }

    public void beYounger() {
        age--;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
