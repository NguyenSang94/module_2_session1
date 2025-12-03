package session02_Kha2;

import java.util.Scanner;

public class session02_kha2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất firstNumber:");
        int firstNumber = sc.nextInt();
        System.out.println("Nhập số thứ hai secondNumber:");
        int secondNumber = sc.nextInt();
        System.out.println("-----Kết quả-----");
        System.out.printf("FirstNumber = %d\n", firstNumber);
        System.out.printf("SecondNumber = %d\n", secondNumber);
        System.out.println("Tổng= " + (firstNumber + secondNumber));
        System.out.println("Tổng= " + (firstNumber + secondNumber));
        System.out.println("Tích= " + (firstNumber * secondNumber));
        System.out.println("Thương= " + (firstNumber / secondNumber));
        System.out.println("Phần Dư= " + (firstNumber % secondNumber));
    }
}
