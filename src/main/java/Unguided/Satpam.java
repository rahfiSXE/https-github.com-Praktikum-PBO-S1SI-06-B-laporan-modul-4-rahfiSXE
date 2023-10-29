package Unguided;

class Satpam extends Pegawai {
    private double jamLembur;

    public Satpam(String NIP, String nama, String alamat, int tahunMasuk, double gajiPokok, double jamLembur) {
        super(NIP, nama, alamat, tahunMasuk, gajiPokok);
        this.jamLembur = jamLembur;
    }

    public double HitungGajiAkhir() {
        double bonus = jamLembur * 10000;
        return gajiPokok + bonus;
    }

    public void cetakSatpam() {
        cetakPegawai();
        System.out.println("Jam Lembur: " + jamLembur);
        System.out.println("Gaji Akhir: " + HitungGajiAkhir());
    }
}
