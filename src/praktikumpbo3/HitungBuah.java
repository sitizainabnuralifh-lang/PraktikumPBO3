package praktikumpbo3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class HitungBuah {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
        );

        int mangga, jambuPerTetangga, jumlahTetangga;
        int manggaBusuk, totalJambu, manggaBaik, totalBuah;

        System.out.print("Jumlah mangga: ");
        mangga = Integer.parseInt(input.readLine());

        System.out.print("Jambu per tetangga: ");
        jambuPerTetangga = Integer.parseInt(input.readLine());

        System.out.print("Jumlah tetangga: ");
        jumlahTetangga = Integer.parseInt(input.readLine());

        System.out.print("Jumlah mangga busuk: ");
        manggaBusuk = Integer.parseInt(input.readLine());

        totalJambu = jambuPerTetangga * jumlahTetangga;
        manggaBaik = mangga - manggaBusuk;
        totalBuah = manggaBaik + totalJambu;

        System.out.println("\n===== HASIL PERHITUNGAN BUAH =====");
        System.out.println("Jumlah mangga awal: " + mangga);
        System.out.println("Jumlah mangga busuk: " + manggaBusuk);
        System.out.println("Jumlah mangga baik: " + manggaBaik);
        System.out.println("Jumlah jambu: " + totalJambu);
        System.out.println("Total buah: " + totalBuah);

    }
}