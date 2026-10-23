package praktikumpbo3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class ContohBufferedReader {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
        );

        String nama;
        int umur;

        System.out.print("Masukkan nama: ");
        nama = input.readLine();

        System.out.print("Masukkan umur: ");
        umur = Integer.parseInt(input.readLine());

        System.out.println("\nNama: " + nama);
        System.out.println("Umur: " + umur);
    }
}