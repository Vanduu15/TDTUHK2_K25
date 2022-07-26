public class GraduateProject extends Course {
    private double score;

    public GraduateProject(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    @Override
    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "GraduateProject [" + super.toString() + "," + score + "]";
    }

    
}