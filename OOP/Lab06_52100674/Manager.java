public class Manager extends Employee {
    private String position;
    private String department;
    private double salaryCoefficientPosition = 5;

    public Manager() {
        super();
        this.position = "Admin";
        this.department = "administrative office";
        this.salaryCoefficientPosition = 5.0;
    }

    public Manager(String ID, String fullName, String department, double coefficientsSalary, String postion,
            double salaryCoefficientPosition) {
        super(ID, fullName, coefficientsSalary);
        this.yearJoined = 2020;
        this.numDaysOff = 0;
        this.position = postion;
        this.salaryCoefficientPosition = salaryCoefficientPosition;
        this.department = department;

    }

    @Override
    public String considerEmulation() {
        return "A";
    }

    public double bonusByPosition() {
        return this.basicSalary * this.salaryCoefficientPosition;
    }

    @Override
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
        return this.basicSalary + this.basicSalary * (this.coefficientsSalary + emulationCoef) + getSenioritySalary()
                + bonusByPosition();
    }

    @Override
    public String toString() {
        return String.format("Manager[%s,%s,%s,%s,%d,%f,%d]", this.ID, this.fullName, this.position,
                this.department, this.yearJoined,
                this.coefficientsSalary, this.numDaysOff);
    }

}
