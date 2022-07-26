import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.*;

public class Main{
    public static MatHang sortList(ArrayList<MatHang> list){
        double max = -1.0;
        for(MatHang c : list){
            if(c.tinhKhuyenMai(5)> max)
            max = c.tinhKhuyenMai(5);
        }
        for(MatHang c : list){
            if(c.tinhKhuyenMai(5) == max)
            return c;
        }
        return null;
    }
    public static void main(String[] args){
        ArrayList<MatHang> c = new ArrayList<MatHang>();
        c.add(new NongSan("mh1","cuqua",5000,"Ca Chua"));
        c.add(new NongSan("mh2","rau",7000,"boxoi"));
        c.add(new HaiSan("mh3","tuoi",5000,"tom"));
        c.add(new HaiSan("mh4","chetqueo",5000,"cua"));

        System.out.println(sortList(c));
    }
}