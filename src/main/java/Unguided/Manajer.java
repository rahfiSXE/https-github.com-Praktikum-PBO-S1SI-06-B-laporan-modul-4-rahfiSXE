package Unguided;

class Manajer extends Pegawai {
    private String divisi;

    public Manajer(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok, String divisi) {
        super(NIP, nama, alamat, tahunMasuk, gajiPokok);
        this.divisi = divisi;
    }

    public double HitungGajiAkhir() {
        int tahunKerja = 2020 - tahunMasuk;
        double tunjangan = 0;
        if (tahunKerja >= 5) {
            tunjangan = gajiPokok * 0.1;
        } else if (tahunKerja >= 3) {
            tunjangan = gajiPokok * 0.05;
        }
        return gajiPokok + tunjangan;
    }

    public void cetakManajer() {
        cetakPegawai();
        System.out.println("Divisi: " + divisi);
        System.out.println("Gaji Akhir: " + HitungGajiAkhir());
    }
}
