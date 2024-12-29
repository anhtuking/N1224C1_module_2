package constructor_accessmodifier.exercise3;

public class Student {
    private int id;
    private String name;
    private double score;
    static int counter = 0;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty()) {
            System.out.println("Name is not empty!");
        } else {
            this.name = name;
        }
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score >= 0 && score <= 10) {
            this.score = score;
        } else {
            System.out.println("Error! Scores between from 0 to 10");
        }
    }
}
