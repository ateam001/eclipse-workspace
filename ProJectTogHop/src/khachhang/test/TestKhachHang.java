package khachhang.test;

import java.util.ArrayList;
import java.util.Scanner;

import khachhang.model.KhachHang;

public class TestKhachHang {
	static ArrayList<KhachHang>dsKH = new ArrayList<KhachHang>();

	public static void menu() {
		System.out.println(" 1 nhap khach hang");
		System.out.println(" 2 Xuat khach hang");
		System.out.println(" 3 Tim kiem khach hang");
		System.out.println(" 4 Sap xep khach hang");
		System.out.println(" 5 Luu khach hang");
		System.out.println(" 6 . Doc  khach hang");
		System.out.println(" 7.Thong ke khach hang  theo nha mang");
		System.out.println(" 8. Thoat");
		int chon = 0;
		System.out.println(" ban chon chuc nang 1-8");
		Scanner sc = new Scanner(System.in);
		chon = Integer.parseInt(sc.nextLine());
		switch(chon) {
		case 1:
			xuLyNhap();
			break;
		case 2: xuLyXuat();
			break;
		case 3:xuLyTimKiem();
			break;
		case 4 :xuLySapXep();
			break;
		case 5 :xuLyLuu();
			break;
		case 6: xuLyDoc();
			break;
		case 7: xuLyThongKe();
			break;
		case 8: Exit();
			break;
		default:
			break;
		}
	}

	private static void Exit() {
		System.out.println(" cam on da su dung phan mem cua chung toi");
		System.exit(0);
	}

	private static int xuLyThongKe() {
		
		return 0;
	}

	private static int xuLyDoc() {
		// TODO Auto-generated method stub
		return 0;
	}

	private static void xuLyLuu() {
		// TODO Auto-generated method stub
		
	}

	private static void xuLySapXep() {
		// TODO Auto-generated method stub
		
	}

	private static void xuLyTimKiem() {
		// TODO Auto-generated method stub
		
	}

	private static void xuLyXuat() {
		
		System.out.println("=====================================");
		System.out.println("Ma \tTen \tPhone");
		for (KhachHang kh : dsKH) {
			System.out.println(kh);
		}
		
		System.out.println("=====================================");
		
	}

	private static void xuLyNhap() {
		KhachHang kh = new KhachHang();
		System.out.println("Moi ban nhap ma");
		int ma = new Scanner(System.in).nextInt();
		System.out.println("Moi ban nhap ten");
		String ten =new Scanner(System.in).nextLine();
		System.out.println("nhap vao so phone");
		String phone = new Scanner(System.in).nextLine();
		
		kh.setMa(ma);
		kh.setTen(ten);
		kh.setPhone(phone);
		dsKH.add(kh);
		
		
	}
	public static void main() {
		while (true) {
			menu();
			
		}
	}

}

