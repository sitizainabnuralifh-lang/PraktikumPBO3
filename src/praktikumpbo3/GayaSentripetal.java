package praktikumpbo3;

import java.util.Scanner;

public class GayaSentripetal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double massa, kecepatan, jariJari, gaya;

        System.out.print("Masukkan massa benda (kg): ");
        massa = input.nextDouble();

        System.out.print("Masukkan kecepatan (m/s): ");
        kecepatan = input.nextDouble();

        System.out.print("Masukkan jari-jari (m): ");
        jariJari = input.nextDouble();

        gaya = massa * kecepatan * kecepatan / jariJari;

        System.out.println("Massa benda: " + massa + " kg");
        System.out.println("Kecepatan: " + kecepatan + " m/s");
        System.out.println("Jari-jari: " + jariJari + " m");
        System.out.println("Gaya sentripetal: " + gaya + " N");

        input.close();
    }
}
