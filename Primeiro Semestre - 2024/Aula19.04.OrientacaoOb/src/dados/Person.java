package dados;

public class Person {
    public String name;
    public int birthYear;
    public byte numberOfChildren;
    public double salary;

    // método

    public int calculateAge(int actualYear) {
        return actualYear - birthYear;

    }
}
