import java.util.Scanner;

public class Tugas2{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //input: jumlah jam kerja, upah (/jam) 
        //output: gaji bulanan karyawan
        //data lain: bonus, pajak
        //algoritma: input jumlah jam kerja dan upah;
        //total gaji bulanan karyawan = (30 [rata2 hari dalam 1 bulan] * jam [dalam sehari] * upah [per jam]) + 10% - 5 %

        double jamKerja;
        double upah;
        double gajiBulananKaryawan;

        System.out.print("Masukkan jumlah jam kerja (per hari): ");
        jamKerja = input.nextDouble();
        System.out.print("Masukkan jumlah upah (Rupiah per jam): ");
        upah = input.nextDouble();

        gajiBulananKaryawan = (30 * jamKerja * upah) * 1.1 * 0.95;

        System.out.println("Upah anda Rp. " + upah + " / jam");
        System.out.println("Jam kerja anda adalah " + jamKerja + " jam / hari");
        System.out.println("Total gaji bulanan anda adalah Rp. " + gajiBulananKaryawan);

    }
}

