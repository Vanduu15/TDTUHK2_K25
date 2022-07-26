public class NongSan extends MatHang{
    private String loaiNongSan;
    public NongSan(String maMH, String tenMH, double giaMH, String loaiNongSan){
        super(maMH, tenMH, giaMH);
        this.loaiNongSan = loaiNongSan;
    }
    public double tinhThue(){
        if("Bap Cai".equals(this.loaiNongSan)==true||"Bap Cai".equals(this.loaiNongSan)==true){
            return 0.1;
        }else{
            return 0.05;
        }
    }
    public double tinhGiaBan(int soLuong){
        return super.tinhGiaBan(soLuong)+super.tinhGiaBan(soLuong)*this.tinhThue();
    }
    public double tinhKhuyenMai(int soLuong){
        return super.tinhGiaBan(soLuong)*0.1;
    }
}