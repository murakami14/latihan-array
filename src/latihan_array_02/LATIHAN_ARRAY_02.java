package latihan_array_02;

import java.util.Scanner;

public class LATIHAN_ARRAY_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] hargaTiket = {
            {40000, 60000},
            {20000, 40000}
        };

        System.out.print("Jumlah Pembeli : ");
        int n = input.nextInt();
        input.nextLine();

        String[] nama = new String[n];
        String[] jurusan = new String[n];
        String[] kelas = new String[n];
        int[] jumlah = new int[n];
        int[] harga = new int[n];
        int[] bayar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Nama                    : ");
            nama[i] = input.nextLine();
            System.out.print("Jurusan (Bandung/Jakarta): ");
            String jur = input.nextLine();
            System.out.print("Kelas (Bisnis/Ekonomi)  : ");
            String kel = input.nextLine();
            System.out.print("Jumlah Tiket            : ");
            jumlah[i] = input.nextInt();
            input.nextLine();

            int kolom = -1, baris = -1;
            if (jur.equalsIgnoreCase("Bandung")) kolom = 0;
            else if (jur.equalsIgnoreCase("Jakarta")) kolom = 1;
            if (kel.equalsIgnoreCase("Bisnis")) baris = 0;
            else if (kel.equalsIgnoreCase("Ekonomi")) baris = 1;

            if (kolom == -1 || baris == -1) {
                System.out.println("Jurusan/Kelas tidak valid, ulangi input data ini!");
                i--;
                continue;
            }

            jurusan[i] = (kolom == 0) ? "Bandung" : "Jakarta";
            kelas[i] = (baris == 0) ? "Bisnis" : "Ekonomi";
            harga[i] = hargaTiket[baris][kolom];
            bayar[i] = harga[i] * jumlah[i];
        }

        String garis = "=".repeat(72);
        System.out.println("\n" + garis);
        System.out.printf("%-5s%-16s%-12s%-10s%-12s%-9s%s%n",
                "No", "Nama Pembeli", "Jurusan", "Kelas", "Jum Tiket", "Harga", "Bayar");
        System.out.println(garis);

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d%-16s%-12s%-10s%-12d%-9d%d%n",
                    i + 1, nama[i], jurusan[i], kelas[i], jumlah[i], harga[i], bayar[i]);
        }
        System.out.println(garis);

        input.close();
    }
}