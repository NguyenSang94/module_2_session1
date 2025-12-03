package session01_Kha1;

import java.util.Scanner;

public class session01_kha1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.println("Nhập Bán kính của một hình tròn:");
        double radius = sc.nextDouble();

        double rais = PI * radius * radius;
        System.out.printf("Diện tích hình tròn = "+ rais);
    }
}
