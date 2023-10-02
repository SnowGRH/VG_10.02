package proba;

import java.util.Scanner;

public class Proba {
    static  String[] Ujlapok;
    public static void main(String[] args) {
        String[] lapok = oszerak();
        kiir(lapok);
        for (int i = 0; i < 3; i++) {
            int oszlop = beolvas();
            kever(oszlop,lapok);
            kiir(Ujlapok);
        }
        ezvolt(Ujlapok);
    }

    private static String[] kever(int oszlop,String[] lap) {
        Ujlapok = new paklik[lap.length];
        switch (oszlop) {
            case 1:
                for (int i = 0; i < 7; i++) {
                    Ujlapok[i]= lap[20-(i-1)*3];
                    Ujlapok[i+7]= lap[19-(i-1)*3];
                    Ujlapok[i+14]= lap[21-(i-1)*3];
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
        String[] lapok = new paklik[22];
        String[] szinek = {"piros", "tők","levél"};
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
