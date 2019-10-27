package decisionMaking;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /* Xếp loại học sinh
        Nếu điểm số < 5 => không đạt
        Nếu điểm số > 5 => đạt
        */
        double diemSo = 0;
        System.out.println("Vui lòng nhập điểm số");

        // Cho người dùng nhập điểm  từ màn hình
        Scanner sc = new Scanner(System.in);
        diemSo = sc.nextDouble();

        //Decision making
        if (diemSo < 5) {
            System.out.println("Xếp loại không đạt");
        } else if (diemSo > 5) {
            System.out.println("Xếp loại đạt");
        } else {
            System.out.println("Dữ liệu không hợp lệ");
        }

    }


}
