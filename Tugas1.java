import java.util.Scanner;

public class Tugas1{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //input: jumlah penggunaan listrik 
        //output: total tagihan listrik, pengecekan jika total > 500 kWh
        //data lain: tarif listrik
        //algoritma: input jumlah penggunaan listrik (jpl) (dalam kWh), tarif listrik = (1500 * jpl), cek apakah jpl > 500 kWh
        
        double jumlahPenggunaanListrik;
        double tarifListrik = 1500.0;
        double totalTarifListrik;

        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        jumlahPenggunaanListrik = input.nextDouble();

        totalTarifListrik = (tarifListrik * jumlahPenggunaanListrik);

        boolean cek = jumlahPenggunaanListrik > 500;

        System.out.println("Pemakaian listrik = " + jumlahPenggunaanListrik + " kWh");
        System.out.println("Total tarif listrik adalah Rp. " + totalTarifListrik);
        System.out.println("Apakah jumlah penggunaan listrik > 500 kWh? " + cek);

    }
}

