public class HocSinhChuyenVan extends HocSinh{
    private String maLop;
    public HocSinhChuyenVan(){
        super();
        this.maLop ="";
    }
    public HocSinhChuyenVan(String hoTen, double diemToan, double diemVan, double diemAnh,String maLop){
        super(hoTen,diemToan,diemVan,diemAnh);
        this.maLop = maLop;
        }
    public double tinhDiemTB(){
        return (double)(diemToan+diemVan*2+diemAnh)/4.0;
    }
    public String toString(){
        return "("+super.hoTen+", "+this.maLop+", "+this.tinhDiemTB()+")";
    }
}