package session01_Gioi2;

import java.util.Scanner;

public class session01_gioi2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chiều rộng:");
        float width = sc.nextFloat();
        System.out.println("Nhập chiều dài:");
        float height = sc.nextFloat();

        float area = width * height;
        float perimeter = 2 * (width + height);
        System.out.println("Diện Tích =" + area);
        System.out.println("Chu Vi=" + perimeter);
    }
}
