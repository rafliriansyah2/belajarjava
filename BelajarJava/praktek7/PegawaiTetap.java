public class PegawaiTetap extends Pegawai {
    PegawaiTetap() {
        super();
        setGajiPokok();
        setTunjangan();
    }

    PegawaiTetap(String NIP, String nama,
            String alamat, char jenisKelamin,
            int umur) {
        super(NIP, nama, alamat, jenisKelamin, umur);
        setGajiPokok();
        setTunjangan();
    }

    PegawaiTetap(String NIP, String nama,
            String alamat, char jenisKelamin,
            int umur, String kodeAgama,
            float gajiPokok, float tunjangan,
            String[] namaAnggotaKeluarga) {
        super(NIP, nama, alamat, jenisKelamin,
                umur, kodeAgama, gajiPokok,
                tunjangan, namaAnggotaKeluarga);
        setGajiPokok();
        setTunjangan();
    }

    void setGajiPokok() {
        // Pegawai tetap mendapatkan gaji pokok 3000000
        this.gajiPokok = 3000000;
    }

    void setTunjangan() {
        // Pegawai tetap mendapatkan tunjangan lebih besar 25000 dari pegawai tetap
        this.tunjangan = 250000;
    }
}
