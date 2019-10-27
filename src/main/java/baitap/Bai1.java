package baitap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cần cộng");

        Scanner sc = new Scanner(System.in);

        String sChuoi = sc.nextLine();
        int iLen = sChuoi.length();
        int sum = 0;
        int so = 0;


        String chuoiCat;

        for (int i = 0; i < iLen; i++) {
            chuoiCat = sChuoi.substring(i, i+1);
            so = Integer.parseInt(chuoiCat);
            sum += so;
        }
        System.out.println(sum);
    }
}
