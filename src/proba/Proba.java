package proba;

import java.util.Scanner;

public class Proba {
    public static void main(String[] args) {
        String [] ujlap;
        String[] lapok = oszerak();
        kiir(lapok);
        for (int i = 0; i < 3; i++) {
            int oszlop = beolvas();
            ujlap= kever(oszlop,lapok);
            kiir(ujlap);
        }
        ezvolt(ujlap);
    }

    private static String[] kever(int oszlop,String[] lap) {
        String[] Ujlapok = new pakli[lap.length];
        switch (oszlop) {
            case 1:
                for (int i = 0; i < 10; i++) {
                    
                }
                break;
        }
        return Ujlapok;
    }

    private static int beolvas() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy számot: ");
        int szam = sc.nextInt();
        return szam;

    }

    private static void kiir(String[] lapok) {
        for (int i = 0; i < lapok.length; i++) {
            if (i / 3 == 0) {
                System.out.println("");
            }
            System.out.println(lapok[i]+" ");
        }

    }

    private static String[] oszerak() {
        String[] lapok = new pakli[22];
        String[] szinek = {"piros", "tők"};
        String[] minták = {"XIII", "IX", "X", "kiraly"};
        int j = 1;
        for (int i = 0; i < 22 && j < lapok.length; i++) {
            lapok[j++] = szinek[j] + "." + minták[i];

        }
        return lapok;
    }

    private static void ezvolt(String[] lapok) {
        System.out.println("ez a kártya volt: "+lapok[11] );
    }

}
