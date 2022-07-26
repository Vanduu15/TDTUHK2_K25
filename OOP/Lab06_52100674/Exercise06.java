public class Exercise06 {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Manager("52100674", "Ven cutes", "TDTU", 30, "Student", 3.0);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m2.getSalary());

    }
}
