import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main2{
    public static MatHang sortList(ArrayList<MatHang> list){
        double max=-1;
        
        for (MatHang l : list) {
            if (l.tinhKhuyenMai(1) > max)    
                max = l.tinhKhuyenMai(1);
        }

        for (MatHang l : list) {
            if (l.tinhKhuyenMai(1) == max)    
                return l;
        }

        return null;
    }
    public static void main(String[] args){
        ArrayList<MatHang> l = new ArrayList<MatHang>();
        l.add(new NongSan("mh1","cuqua",5000,"Ca Chua"));
        l.add(new NongSan("mh2","cuqua",7000,"Bap Cai"));
        l.add(new HaiSan("mh3","song",5000,"tommm"));
        l.add(new HaiSan("mh4","song",7000,"tep")); 

    System.out.println(sortList(l)); 
}
}