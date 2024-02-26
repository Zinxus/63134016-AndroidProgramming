package lap2;

import java.util.Scanner;

public class b3 {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số điện sử dụng: ");
	        int soDien = scanner.nextInt();
	        double tien;
	        if (soDien <= 50) {
	            tien = soDien * 1000;
	        } else {
	            tien = 50 * 1000 + (soDien - 50) * 1200;
	        }
	        System.out.printf("Số tiền điện phải trả là: %.2f đồng\n", tien);
	        scanner.close();
	    }
}
