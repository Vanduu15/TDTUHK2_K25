public class Exercise01 {
    public static void main(String[] args) {
        Student s1 = new Student("Tran","Thi","Ven",10);
        Student s2 = new Student("Van","Van","Du",9.5);
        Student.StudentOperator so1 = s1.new StudentOperator();
        Student.StudentOperator so2 = s2.new StudentOperator();
        System.out.println(so1.print());
        System.out.println(so1.type());
        System.out.println(so2.print());
        System.out.println(so2.type());
    }
}