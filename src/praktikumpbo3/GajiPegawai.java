package praktikumpbo3;

import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String npm, nama, alamat, jabatan;
        double gajiPokok = 2000000;
        double tunjanganJabatan = 300000;
        double tunjanganIstri = 200000;
        double tunjanganAnak = 150000;
        double totalGaji, pajak, gajiBersih;

        System.out.print("Nomor Induk Karyawan: ");
        npm = input.nextLine();

        System.out.print("Nama Karyawan: ");
        nama = input.nextLine();

        System.out.print("Alamat: ");
        alamat = input.nextLine();

        System.out.print("Jabatan: ");
        jabatan = input.nextLine();

        totalGaji = gajiPokok + tunjanganJabatan
                  + tunjanganIstri + tunjanganAnak;

        pajak = 0.10 * (gajiPokok + tunjanganJabatan
                      + tunjanganIstri);

        gajiBersih = totalGaji - pajak;

        System.out.println("Nomor Induk Karyawan     : " + npm);
        System.out.println("Nama Karyawan             : " + nama);
        System.out.println("Alamat            : " + alamat);
        System.out.println("Jabatan           : " + jabatan);
        System.out.println("Gaji Pokok        : Rp" + gajiPokok);
        System.out.println("Tunjangan Jabatan : Rp" + tunjanganJabatan);
        System.out.println("Tunjangan Istri   : Rp" + tunjanganIstri);
        System.out.println("Tunjangan Anak    : Rp" + tunjanganAnak);
        System.out.println("Total Gaji        : Rp" + totalGaji);
        System.out.println("Pajak Penghasilan : Rp" + pajak);
        System.out.println("Gaji Bersih       : Rp" + gajiBersih);

        input.close();
    }
}
