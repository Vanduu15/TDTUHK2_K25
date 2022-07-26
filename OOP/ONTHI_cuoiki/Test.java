import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test {
    public static Course sortList(ArrayList<Course> list) {
        double max = -1.0;

        for (Course c : list) {
            if (c.getScore() > max)    
                max = c.getScore();
        }

        for (Course c : list) {
            if (c.getScore() == max)    
                return c;
        }

        return null;
    }
    public static void main(String[] args) {
        ArrayList<Course> c = new ArrayList<Course>();

        c.add(new GraduateProject("A", 1, 5.0));
        c.add(new GraduateProject("B", 2, 9.0));
        c.add(new GraduateProject("C", 3, 6.0));
        c.add(new GraduateProject("D", 4, 8.0));
        c.add(new GraduateProject("E", 5, 7.0));

        // for (Course co : c) {
        //     System.out.println(co);
        // }

        System.out.println(sortList(c));
    }
}
