package com.vti.backend;
import java.util.ArrayList;
import com.vti.entity.Inheritance.Ex5.Q1_2.*;
import java.util.Scanner;

public class QLCB {

	private ArrayList<CanBo> canbos;
	public QLCB() {
		canbos = new ArrayList<>();
	}

		// a thêm mới cán bộ
	public void addCanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập số lượng cán bộ muốn thêm");
		int n = scanner.nextInt();
		
		byte choose;
		CanBo canbo = new CanBo();
		for(int i=0 ; i<n ; i++) {
			System.out.println("Mời bạn chọn loai cán bộ (1: Kỹ sư, 2: công nhân, 3: Nhân vien)");
			choose = scanner.nextByte();
			if(choose == 1) {
				canbo = new Engineer();
			}else if (choose == 2) {
				canbo = new Worker();
			}else if(choose == 3) {
				canbo = new NhanVien();
			}else {
				System.out.println("Nhập sai!!");
				i--;
			}
			
			canbo.input();
			canbos.add(canbo);
			scanner.close();
		}
	}
	// b. tìm kiem theo ho ten
	public void findCanbo() {
	Scanner scanner = new Scanner(System.in);
	System.out.println("moi ban nhap ho ten:");
	String hoten = scanner.nextLine();
	for (CanBo canbo : canbos) {
	if(hoten.equals(canbo.getFullname()) ){
		System.out.println(canbo.getFullname());
		}
	}
	}
	// hien thi thong tin danh sach cac can bo
	public void getInfoCanBo() {
		for (CanBo canbo : canbos) {
			canbo.getInfo();
		}
	}
		
	// Nhap vao ten của can bo va delete can bo do
		public void deleteCanBo() {
			Scanner scanner = new Scanner(System.in);

			String hoTen;
			System.out.println("Nhập họ tên cần xóa: ");
			hoTen = scanner.nextLine();

			canbos.removeIf(cb -> hoTen.equals(cb.getFullname()));
		
		}
		
		

}




