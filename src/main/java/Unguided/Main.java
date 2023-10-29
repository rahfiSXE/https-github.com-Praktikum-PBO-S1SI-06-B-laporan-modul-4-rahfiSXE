package Unguided;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Satpam dan mengatur datanya
        Satpam S = new Satpam("Rendra", "0042", "Jl. Itik 15", 2000, 300000, 5);

        // Membuat objek Sales dan mengatur datanya
        Sales T = new Sales("Wibisana", "0185", "Jl. Ayam 78", 2006, 500000, 10);

        // Membuat objek Manajer dan mengatur datanya
        Manajer M = new Manajer("Adi", "0005", "Jl. Angsa 56", 1999, 1500000, "Keuangan");

        // Menampilkan informasi pegawai
        System.out.println("==DISPLAY DATA KARYAWAN==");
        System.out.println("Data Satpam:");
        S.cetakSatpam(); // Menampilkan informasi Satpam

        System.out.println("\nData Sales:");
        T.cetakSales(); // Menampilkan informasi Sales

        System.out.println("\nData Manajer:");
        M.cetakManajer(); // Menampilkan informasi Manajer
    }
}

