package decisionMaking;

import java.util.Scanner;

public class SwichCaseDemo {
    public static void main(String[] args) {
        // Cho người dùng nhập
        System.out.println("1. Cơm canh chua");
        System.out.println("2. Cá chiên sả ớt");
        System.out.println("3. Mì xào bò");
        System.out.println("4. Phở");
        System.out.println("5. Thịt kho trứng");
        System.out.println("6. Hủ tiếu nam vang");

        // Người dùng nhập số theo menu để chọn món ăn
        Scanner sc = new Scanner(System.in);

        System.out.println("Vui lòng nhập số tương ứng với menu");
        int i = sc.nextInt();

        System.out.println("Mời nhập số lượng món ăn");

        int soLuong = sc.nextInt();
        switch (i) {
            case 1:
                System.out.println("Cần order Cơm canh chua " + soLuong);
                break;
            case 2:
                System.out.println("Cần order Cá chiên sả ớt " + soLuong);
                break;
            case 3:
                System.out.println("Cần order Mì xào bò " + soLuong);
                break;
            case 4:
                System.out.println("Cần order Phở " + soLuong);
                break;
            case 5:
                System.out.println("Cần order Thịt kho trứng " + soLuong);
                break;
            case 6:
                System.out.println("Cần order Hủ tiếu nam vang " + soLuong);
                break;
            default:
                System.out.println("Người dùng cần nhập đúng số tương ứng");
        }


    }
}
