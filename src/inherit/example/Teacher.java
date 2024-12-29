package inherit.example;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(int id, String name, double salary) {
//        getName();
//        getId();
        super(id, name);
        this.salary = salary;
    }
}
