package lap2;

import java.util.Scanner;

public class b4 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
            menu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    giaiPTB1();
                    break;
                case 2:
                    giaiPTB2();
                    break;
                case 3:
                    tinhTienDien();
                    break;
                case 4:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập số từ 1 đến 4!");
            }
        
        scanner.close();
    }

    private static void menu() {
        System.out.println("+---------------------------------------------------+");
        System.out.println("| 1. Giải phương trình bậc nhất                    |");
        System.out.println("| 2. Giải phương trình bậc 2                      |");
        System.out.println("| 3. Tính tiền điện                               |");
        System.out.println("| 4. Thoát chương trình                            |");
        System.out.println("+---------------------------------------------------+");
        System.out.print("Chọn chức năng: ");
    }

    private static void giaiPTB1() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            double x = -b / a;
            System.out.printf("Phương trình có nghiệm duy nhất: x = %.2f\n", x);
        }
        scanner.close();
    }

    private static void giaiPTB2() {
    	Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            giaiPTB1(b, c);
        } else {
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.printf("Phương trình có nghiệm kép x = %.2f\n", x);
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương trình có hai nghiệm phân biệt:\n");
                System.out.printf("x1 = %.2f\n", x1);
                System.out.printf("x2 = %.2f\n", x2);
            }
        }
        scanner.close();
    }
    private static void giaiPTB1(double b, double c) {
        if (b == 0) {
            if (c == 0) {
                System.out.println("Phương trình có vô số nghiệm!");
            } else {
                System.out.println("Phương trình vô nghiệm!");
            }
        } else {
            double x = -c / b;
            System.out.printf("Phương trình có nghiệm duy nhất: x = %.2f\n", x);
        }
    }

    private static void tinhTienDien() {
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
