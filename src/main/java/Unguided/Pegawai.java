package Unguided;

class Pegawai {
    protected String NIP, nama, alamat;
    protected int tahunMasuk;
    protected double gajiPokok;

    public Pegawai(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
    }

    public double HitungGajiAkhir() {
        return gajiPokok;
    }

    public void cetakPegawai() {
        System.out.println("NIP: " + NIP);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Tahun Masuk Kerja: " + tahunMasuk);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
