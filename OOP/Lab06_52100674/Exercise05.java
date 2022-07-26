public class Exercise05 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("52100674", "Ven cute", 100000000);

                               
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e2.getSenioritySalary());
        System.out.println(e2.getSalary());
    }
}
