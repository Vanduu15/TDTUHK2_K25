import java.util.Calendar;

public class Employee {
    protected String ID;
    protected String fullName;
    protected int yearJoined;
    protected double coefficientsSalary;
    protected int numDaysOff;
    protected double basicSalary = 1150;

    public Employee() {
        this.ID = "0";
        this.fullName = "";
        this.yearJoined = 2020;
        this.coefficientsSalary = 1.0;
        this.numDaysOff = 0;
    }

    public Employee(String ID, String fullName, double coefficientsSalary) {
        this.ID = ID;
        this.fullName = fullName;
        this.coefficientsSalary = coefficientsSalary;
        this.yearJoined = 2003;
        this.numDaysOff = 0;
    }

    public double getSenioritySalary() {

        int yearWork = Calendar.getInstance().get(Calendar.YEAR) - yearJoined;

        return yearWork >= 5 ? this.yearJoined * this.coefficientsSalary / 100 : 0;
    }

    public String considerEmulation() {
        if (this.numDaysOff <= 1) {
            return "A";
        }
        if (2 <= this.numDaysOff && this.numDaysOff <= 3) {
            return "B";
        }
        return "C";
    }

    public double getSalary() {

        double emulationCoef = 0;

        switch (considerEmulation()) {
            case "A":
                emulationCoef = 1;
                break;
            case "B":
                emulationCoef = 0.75;
                break;
            case "C":
                emulationCoef = 0.5;
                break;
        }

        return this.basicSalary + this.basicSalary * (this.coefficientsSalary + emulationCoef)
                + this.getSenioritySalary();

    }

    @Override
    public String toString() {
        return String.format("Employee[%s,%s,%d,%f,%d]", this.ID, this.fullName, this.yearJoined,
                this.coefficientsSalary, this.numDaysOff);
    }
}