package proba;

import java.util.Scanner;

public class Proba {

    static String[] Ujlapok;
    static String[] lapok;

    public static void main(String[] args) {
        oszerak();
        kiir(lapok);
        int oszlop = beolvas();
        kever(oszlop, lapok);
        kiir(Ujlapok);

        ezvolt(Ujlapok);
    }

    private static String[] kever(int oszlop, String[] lap) {
        Ujlapok = new String[lap.length];
        switch (oszlop) {
            case 1:
                for (int i = 0; i < 7; i++) {
                    Ujlapok[i] = lap[20 - (i - 1) * 3];
                    Ujlapok[i + 7] = lap[19 - (i - 1) * 3];
                    Ujlapok[i + 14] = lap[21 - (i - 1) * 3];
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
            System.out.println(lapok[i] + " ");
        }

    }

    private static String[] oszerak() {
        lapok = new String[22];
        String[] szinek = {"piros", "tők", "levél"};
        String[] mintak = {"XIII", "IX", "X", "kiraly"};
        int j = 0;
        for (String szin : szinek) {
            for (int i = 0; i < 22 && j < szin.length(); i++) {
                lapok[j++] = szinek[j] + "." + mintak[i];
            }
        }

        return lapok;
    }

    private static void ezvolt(String[] lapok) {
        System.out.println("ez a kártya volt: " + lapok[11]);
    }

}
