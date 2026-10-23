package praktikumpbo3;

import java.util.Scanner;

public class CetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahNovel, lembarPerNovel;
        int totalLembar, detik;
        int hari, jam, menit, sisaDetik;

        System.out.print("Masukkan jumlah novel: ");
        jumlahNovel = input.nextInt();

        System.out.print("Masukkan jumlah lembar per novel: ");
        lembarPerNovel = input.nextInt();

        totalLembar = jumlahNovel * lembarPerNovel;

        detik = totalLembar;

        hari = detik / 86400;
        detik = detik % 86400;

        jam = detik / 3600;
        detik = detik % 3600;

        menit = detik / 60;
        sisaDetik = detik % 60;

        System.out.println("\n===== HASIL PENCETAKAN NOVEL =====");
        System.out.println("Jumlah novel: " + jumlahNovel);
        System.out.println("Lembar per novel: " + lembarPerNovel);
        System.out.println("Total lembar: " + totalLembar);
        System.out.println("Waktu yang diperlukan:");
        System.out.println(hari + " hari, " + jam + " jam, "
                + menit + " menit, " + sisaDetik + " detik");

        input.close();
    }
}
