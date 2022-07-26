// class Course, class GraduateProject kế thừa  Course
// hàm main yêu cầu nạp 5 đối tượng GraduateProject  
// vào arraylist, tìm ra thằng có điểm cao nhất

public abstract class Course{
    protected String name;
    protected int age;

    public Course(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract double getScore();

    @Override
    public String toString() {
        return age + ", " + name;
    }


    
}