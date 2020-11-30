package backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Bao;
import com.vti.entity.QLTV;
import com.vti.entity.Sach;
import com.vti.entity.Tapchi;

public class QuanLySach {

	ArrayList<QLTV> qltv = new ArrayList<QLTV>();

	public void addTaiLieu() {
		QLTV TL = new QLTV();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap so luong tai lieu muon them");
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println("Hay nhap loai TL muon them. 1: Sach, 2:TapChi, 3:Bao");
			switch (scanner.nextInt()) {
			case 1:
				TL = new Sach();
				break;
			case 2:
				TL = new Tapchi();
				break;
			case 3:
				TL = new Bao();
				break;
			}
			scanner.nextLine();
			System.out.println("Vui long nhap ma tai lieu");
			TL.setMaTaiLieu(scanner.nextLine());
			System.out.println("Vui long nhap ten nha XB");
			TL.setNhaXB(scanner.nextLine());
			System.out.println("Vui long nhap so ban xuat hanh");
			TL.setSoBanPhatHanh(scanner.nextShort());
			qltv.add(TL);

		}
		for (QLTV thuvien : qltv) {
			System.out.println(thuvien);
		}
	}

	// b) xoa TL theo ma TL
	public void xoaTL() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ma tai lieu muon xoa");
		String x = scanner.nextLine();
		for (int i = 0; i < qltv.size();) {
			if (x.equals(qltv.get(i).getMaTaiLieu())) {
				qltv.remove(i);
			} else {
				i++;
			}

		}
		for (QLTV thuvien : qltv) {
			System.out.println(thuvien);
		}

	}
	
	// c) Hien thi thong tin tai lieu
	public void showTL() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhap ma TL muon hien thi thong tin");
	String x = scanner.nextLine();
	for(int i=0;i<qltv.size();i++) {
		if(x.equals(qltv.get(i).getMaTaiLieu())) {
			System.out.println(qltv.get(i));
		}
	}
	}
	
	//e) thoat khoi truong chinh
	public void exit() {
		System.out.println("=====THOAT=====");
	}

}
