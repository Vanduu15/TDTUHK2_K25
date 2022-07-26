import java.util.*;
public class Test{
    public static void main(String[] args){
    HocSinh hs = new HocSinh("Du",10,10,9);
    HocSinhChuyenVan hscv = new HocSinhChuyenVan("Duuu",10,8,10,"CV");
    System.out.println(hs.tinhDiemTB());
    System.out.println(hscv.tinhDiemTB());
    System.out.println(hs.toString());
    System.out.println(hscv.toString());
}
}