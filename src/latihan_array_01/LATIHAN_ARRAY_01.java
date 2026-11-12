import java.util.Scanner;

public class LATIHAN_ARRAY_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah Mahasiswa : ");
        int n = input.nextInt();
        input.nextLine();

        String[] nim = new String[n];
        String[] nama = new String[n];
        double[] uts = new double[n];
        double[] uas = new double[n];
        double[] na = new double[n];
        char[] index = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nData ke-" + (i + 1));
            System.out.print("Nim  : ");
            nim[i] = input.nextLine();
            System.out.print("Nama : ");
            nama[i] = input.nextLine();
            System.out.print("UTS  : ");
            uts[i] = input.nextDouble();
            System.out.print("UAS  : ");
            uas[i] = input.nextDouble();
            input.nextLine();

            na[i] = 0.5 * uts[i] + 0.5 * uas[i];

            if (na[i] >= 80) {
                index[i] = 'A';
            } else if (na[i] >= 70) {
                index[i] = 'B';
            } else if (na[i] >= 60) {
                index[i] = 'C';
            } else if (na[i] >= 50) {
                index[i] = 'D';
            } else {
                index[i] = 'E';
            }
        }

        String garis = "=".repeat(60);
        System.out.println("\n" + garis);
        System.out.printf("%-5s%-14s%-12s%-8s%-8s%-13s%s%n",
        "No", "Nim", "Nama", "UTS", "UAS", "Nilai Akhir", "Index");
        System.out.println(garis);

        for (int i = 0; i < n; i++) {
        String nilaiAkhir = (na[i] == (int) na[i])
            ? String.valueOf((int) na[i]) : String.valueOf(na[i]);
        System.out.printf("%-5d%-14s%-12s%-8s%-8s%-13s%c%n",
            i + 1, nim[i], nama[i], (int) uts[i], (int) uas[i], nilaiAkhir, index[i]);
}
        System.out.println(garis);

        input.close();
    }
}