package Btvn;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        while (true) {
            qlAcout qlAcout = new qlAcout();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Quan Ly Acout");
            System.out.println("1.Hien thi Acout");
            System.out.println("2.them Acout");
            System.out.println("3.sua pass");
            System.out.println("4.xoa tk");
            System.out.println(" 5.tim tk ");
            System.out.println("6. thoat");
            int so = Integer.parseInt(scanner.nextLine());
            switch (so) {
                case 1:
                    qlAcout.hienthi();
                    break;
                case 2:
                    Acout acout = qlAcout.tao();
                    qlAcout.them(acout);
                    break;
                case 3:
                    qlAcout.sua();
                    break;
                case 4:
                    qlAcout.xoa();
                    break;
                case 5:
                    qlAcout.tim();
                    break;
                default:
                    System.exit(6);

            }
        }
    }
}
