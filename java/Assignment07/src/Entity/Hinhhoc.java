package Entity;

public class Hinhhoc {
	
	public static int count = 0;
	public void tinhchuvi() {
		
	}
	public void tinhdientich() {
		
	}
	
	public Hinhhoc() throws HinhHocException {
	super();
	count ++;
	limitHinhhoc();
	}
	
	public void limitHinhhoc() throws HinhHocException {
		if (count >5) {
			throw new HinhHocException ("So luong hinh toi da " + Configs.so_luong_hinh_toi_da );
		}
	}
	
	
	
	
}
