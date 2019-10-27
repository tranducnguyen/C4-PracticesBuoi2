package Orerator;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class OperatorDemo {
    public static void main(String[] args) {
        int x = 9;
        x += 1;
        System.out.println(x);

        // Chia lấy dư
        int y = x % 3;
        System.out.println(y);
        int i = 20;

        if (y == x) {
            System.out.println(" y = x = " + y);

        } else if (y != x) {
            System.out.println("y !=x và y = " + y);
        }

        System.out.println("!(y ==x || x > 0)");
        if ((y == x || x > 0)) {

            System.out.print("y !=x và y = " + y);
        }
        // Toán tử điều kiện

        int j = 0;
        j = x > 0 ? 10 : -10;
        System.out.println("Giá trị của j là "+ j);

    }
}
