package praktikumpbo3;

import java.util.Scanner;

public class ContohScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama;
        int umur;

        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan umur: ");
        umur = input.nextInt();

        System.out.println("\nNama: " + nama);
        System.out.println("Umur: " + umur);

        input.close();
    }
}
