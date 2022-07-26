public class HaiSan extends MatHang{
    private String loaiHaiSan;
    public HaiSan(String maMH, String tenMH, double giaMH, String loaiHaiSan){
        super(maMH, tenMH, giaMH);
        this.loaiHaiSan=loaiHaiSan;
    }
    public double tinhKhuyenMai(int soLuong){
        if(soLuong<=5){
            return 0.0;
        }
            return 0.05*super.tinhGiaBan(soLuong);
        }
}