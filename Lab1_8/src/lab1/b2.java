package lab1;

import java.util.Scanner;

public class b2 {
	private double dai;
	private double rong;
	
	public b2(double chieuDai,double chieuRong) {
		dai=chieuDai;
		rong=chieuRong;
	}
	public double ChuVi() {
		return (dai+rong)*2;
	}
	public double DienTich() {
		return dai*rong;
	}
	public double CanhNhoNhat() {
		return Math.min(dai, rong);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhp chieu dai hinh chu nhat:");
		double dai= scanner.nextDouble();
			
		System.out.println("Nhap chieu rong hinh chu nhat");
		double rong= scanner.nextDouble();
		
		b2 hinhChuNhat= new b2(dai,rong);
		
		double chuvi=hinhChuNhat.ChuVi();
		double dientich=hinhChuNhat.DienTich();
		double canhnhonhat=hinhChuNhat.CanhNhoNhat();
		
		System.out.println("Chu vi hinh chu nhat la: "+chuvi);
		System.out.println("Dien tich hinh chu nhat la: "+dientich);
		System.out.println("Canh nho nhat hinh chu nhat la: "+canhnhonhat);
		
		scanner.close();	
	}
}
