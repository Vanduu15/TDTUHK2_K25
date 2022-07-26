public class Main1{
    public static void main(String[] args){
        HocSinh hs= new HocSinh("Du",10,9,9);
        HocSinhChuyenVan hscv= new HocSinhChuyenVan("Venn",10,8,8,"21A");
        System.out.println(hs.tinhDiemTB());
        System.out.println(hscv.tinhDiemTB());
}
}