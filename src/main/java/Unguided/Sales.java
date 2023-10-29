package Unguided;

class Sales extends Pegawai {
    private int jumlahPelanggan;

    public Sales(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok, int jumlahPelanggan) {
        super(NIP, nama, alamat, tahunMasuk, gajiPokok);
        this.jumlahPelanggan = jumlahPelanggan;
    }

    public double HitungGajiAkhir() {
        double komisi = jumlahPelanggan * 50000;
        return gajiPokok + komisi;
    }

    public void cetakSales() {
        cetakPegawai();
        System.out.println("Jumlah Pelanggan: " + jumlahPelanggan);
        System.out.println("Gaji Akhir: " + HitungGajiAkhir());
    }
}
