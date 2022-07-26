public class Exercise03{
    public static void main(String [] args){
        Student s1=new Student(52100674,"tran","ven");
        Student s2=new Student(99999999,"tran","vy");

        System.out.println(s1.getFistName());
        System.out.println(s1.getLastName());
        System.out.println(s1.getName());
        System.out.println(s1);
        System.out.println(s2);
    }
}