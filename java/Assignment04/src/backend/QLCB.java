package backend;

import java.util.ArrayList;
import java.util.Scanner;

import com.vti.entity.Inheritance.Ex5.Q1_2.CanBo;
import com.vti.entity.Inheritance.Ex5.Q1_2.Engineer;
import com.vti.entity.Inheritance.Ex5.Q1_2.NhanVien;
import com.vti.entity.Inheritance.Ex5.Q1_2.Worker;

public class QLCB {

	ArrayList<CanBo> canbos = new ArrayList<CanBo>();

	public void addCanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hãy nhập số lượng cán bộ muốn thêm");
		int n = scanner.nextInt();

		byte choose;
		for (int i = 0; i < n; i++) {

			CanBo canbo1 = new CanBo();

			System.out.println("Mời bạn chọn loai cán bộ (1: Kỹ sư, 2: công nhân, 3: Nhân vien)");
			choose = scanner.nextByte();
			if (choose == 1) {
				canbo1 = new Engineer();
			} else if (choose == 2) {
				canbo1 = new Worker();
			} else if (choose == 3) {
				canbo1 = new NhanVien();
			} else {
				System.out.println("Nhập sai!!");
				i--;
			}
			scanner.nextLine();
			System.out.println("Nhap ten can bo");
			canbo1.setFullname(scanner.nextLine());
			System.out.println("Nhap tuoi cua can bo:");
			canbo1.setAge(scanner.nextByte());
			System.out.println("Nhap gioi tinh 0: Nam, 1: Nu, 2: Unknown");
			canbo1.setGioitinh(scanner.nextInt());
			scanner.nextLine();
			System.out.println("Nhap dia chi");
			canbo1.setAddress(scanner.nextLine());
			canbos.add(canbo1);
		}

	}

	public void hienThiListCanBo() {
		for (CanBo canbo : canbos) {
			System.out.println(canbo);
		}

	}
	// b. tìm kiem theo ho ten
	public void findCanbo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("moi ban nhap ho ten:");
		String hoten = scanner.nextLine();
		for (CanBo canbo : canbos) {
			if (hoten.equals(canbo.getFullname())) {
				System.out.println(canbo.getFullname());
			}
		}
	}
	// c) xoa canbo
	public void xoaCanBo() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten can bo muon xoa:");
		String name = scanner.nextLine();
		for(int i =0; i <canbos.size();) {
			if(canbos.get(i).getFullname().equals(name)){
				canbos.remove(i);
			}else {
				i++;
			}
		}
		
		
		
		
		// cach 2
//		for(CanBo canbo:canbos) {
//			if(canbo.getFullname().equals(name)) {
//				canbos.remove(canbo);
//				return;
//			}
//			
//		}
	}
	
}
