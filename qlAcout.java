package Btvn;

import java.util.Scanner;

public class qlAcout {
//    Acout acout = new Acout();
    static Acout[] mangbd = new Acout[0];
    static Scanner scanner = new Scanner(System.in);

    public void hienthi() {
        for (int i = 0; i < mangbd.length; i++)
            System.out.println(mangbd[i].tostring());
    }

    public Acout tao() {
        System.out.println("Id la");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("usname la");
        String usname = scanner.nextLine();
        System.out.println("pass la ");
        String pass = scanner.nextLine();
        System.out.println("phone la");
        String phone = scanner.nextLine();
        System.out.println(" ngay sinh la");
        String date = scanner.nextLine();
        Acout acout2 = new Acout(id, usname, pass, phone, date);
        return acout2;
    }

    public void them(Acout acout1) {
        Acout[] mang2 = new Acout[mangbd.length + 1];
        for (int i = 0; i < mang2.length - 1; i++) {
            mang2[i] = mangbd[i];
        }
        mang2[mang2.length - 1] = acout1;
        mangbd = mang2;
    }


    public int vitri(String name1) {
        for (int i = 0; i < mangbd.length; i++) {
            if (name1.equals(mangbd[i].getUsname())) {
                return i;

            }
        }
        return -1;
    }

    public void xoa() {
        System.out.println("nhap ten muon xoa");
        String name1 = scanner.nextLine();
        int index = vitri(name1);
        Acout[] mang2 = new Acout[mangbd.length - 1];
        if (index != -1) {
            for (int i = 0; i < mangbd.length; i++) {
                if (i < index) {
                    mang2[i] = mangbd[i];

                } else {
                    mang2[i] = mangbd[i + 1];
                }

            }
            mangbd = mang2;
        }

    }

    public void tim() {
        System.out.println("nhap ten muon tim");
        String name1 = scanner.nextLine();
        int index = vitri(name1);
        System.out.println(mangbd[index].tostring());


    }

    public void sua() {
        System.out.println("nhap ten muon sua");
        String name1 = scanner.nextLine();
        int index = vitri(name1);
        if (name1.equals(mangbd[index].getUsname())) {
            System.out.println("nhap pass moi");
            mangbd[index].setPassword(scanner.nextLine());
            System.out.println(mangbd[index].tostring());


        }


    }
}





