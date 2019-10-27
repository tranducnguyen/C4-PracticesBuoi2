package loop;

import org.omg.Messaging.SyncScopeHelper;
import sun.awt.windows.WPrinterJob;

public class LoopDemo {
    public static void main(String[] args) {
        // in ra tu 1 đến 100
        /*for (int i = 1; i<= 100; i++){
            System.out.println("gia tri i là "+ i);
            if (i == 50){
                break;
            }
        }
        */
        int a = 1;
        int sum =0;
        do {
            sum +=a;
            a++;
        }while (a <= 5);

        System.out.println(sum);

    }
}
