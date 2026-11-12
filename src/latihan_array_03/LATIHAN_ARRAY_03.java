package latihan_array_03;

import java.util.Scanner;

public class LATIHAN_ARRAY_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kodeBarang = {"A01", "B02", "C02"};
        String[] namaBarang = {"Hardisk", "Monitor", "Mouse"};
        int[] hargaSatuan = {700000, 800000, 50000};

        System.out.print("Jumlah Pembeli : ");
        int n = input.nextInt();
        input.nextLine();

        String[] nama = new String[n];
        String[] kode = new String[n];
        String[] barang = new String[n];
        int[] jumlah = new int[n];
        int[] harga = new int[n];
        int[] bayar = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Nama Pembeli                 : ");
            nama[i] = input.nextLine();
            System.out.print("Kode Barang (A01/B02/C02)    : ");
            String kd = input.nextLine();
            System.out.print("Jumlah                       : ");
            jumlah[i] = input.nextInt();
            input.nextLine();

            int idx = -1;
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equalsIgnoreCase(kd)) {
                    idx = j;
                    break;
                }
            }

            if (idx == -1) {
                System.out.println("Kode barang tidak ditemukan, ulangi input data ini!");
                i--;
                continue;
            }

            kode[i] = kodeBarang[idx];
            barang[i] = namaBarang[idx];
            harga[i] = hargaSatuan[idx];
            bayar[i] = harga[i] * jumlah[i];
        }

        String garis = "=".repeat(76);
        System.out.println("\n" + garis);
        System.out.printf("%-5s%-16s%-13s%-12s%-9s%-10s%s%n",
                "No", "Nama Pembeli", "KodeBarang", "NamaBarang", "Jumlah", "Harga", "Bayar");
        System.out.println(garis);

        for (int i = 0; i < n; i++) {
            System.out.printf("%-5d%-16s%-13s%-12s%-9d%-10d%d%n",
                    i + 1, nama[i], kode[i], barang[i], jumlah[i], harga[i], bayar[i]);
        }
        System.out.println(garis);

        input.close();
    }
}