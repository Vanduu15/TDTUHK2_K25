public class Person{
	public String hoTen;
	public int tuoi;
	public boolean gioiTinh;

	public Person(String hoTen, int tuoi, boolean gioiTinh){
		this.hoTen=hoTen;
		this.tuoi=tuoi;
		this.gioiTinh=gioiTinh;
	}

	public void displayInfo(){
		System.out.println("hoTen" +hoTen);
		System.out.println("tuoi" +tuoi);
		if ( gioiTinh == true){
			System.out.println("Nam");
		} else
		{
			System.out.println("Nu");}
	}
	public int getTuoi(){
		return tuoi;
	}
}
