package lab1;

import java.util.Scanner;

public class b3 {
	public static void main(String[] args){
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("Nhap canh cua mot khoi lap phuong:");
		float canh=scanner.nextFloat();
		
		float Thetich = canh*canh*canh;
		//float Thetich= (float)Math.pow(canh,3);
		
		System.out.println("The tich hinh lap phuong la: "+Thetich);
		
		scanner.close();
	}
}
