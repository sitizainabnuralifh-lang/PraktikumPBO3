package praktikumpbo3;

import java.io.*;

public class Pembelanjaan {
    public static void main(String[] args) throws IOException {
        DataInputStream input = new DataInputStream(System.in);

        System.out.print("Nama Pembeli: ");
        String nama = input.readLine();

        System.out.print("Total Belanja: ");
        double belanja = Double.parseDouble(input.readLine());

        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(input.readLine());

        double potongan = belanja * diskon / 100;
        double total = belanja - potongan;

        System.out.print("Bayar: ");
        double bayar = Double.parseDouble(input.readLine());

        double kembalian = bayar - total;

        System.out.println("\n===== STRUK BELANJA =====");
        System.out.println("Nama Pembeli : " + nama);
        System.out.println("Total Belanja: Rp" + belanja);
        System.out.println("Diskon       : " + diskon + "%");
        System.out.println("Total Bayar  : Rp" + total);
        System.out.println("Uang Bayar   : Rp" + bayar);
        System.out.println("Kembalian    : Rp" + kembalian);

        DataOutputStream output = new DataOutputStream(
            new FileOutputStream("hasil_belanja.txt")
        );

        output.writeUTF("Nama Pembeli: " + nama);
        output.writeUTF("Total Belanja: Rp" + belanja);
        output.writeUTF("Diskon: " + diskon + "%");
        output.writeUTF("Total Bayar: Rp" + total);
        output.writeUTF("Uang Bayar: Rp" + bayar);
        output.writeUTF("Kembalian: Rp" + kembalian);

        output.close();
    }
}
