public class PegawaiHonorer extends Pegawai {
    PegawaiHonorer() {
        super();
        setGajiPokok();
    }

    PegawaiHonorer(String NIP, String nama,
            String alamat, char jenisKelamin,
            int umur) {
        super(NIP, nama, alamat, jenisKelamin, umur);
        setGajiPokok();
    }

    PegawaiHonorer(String NIP, String nama,
            String alamat, char jenisKelamin,
            int umur, String kodeAgama,
            float gajiPokok,
            float tunjangan, String[] namaAnggotaKeluarga) {
        super(NIP, nama, alamat, jenisKelamin,
                umur, kodeAgama, gajiPokok,
                tunjangan, namaAnggotaKeluarga);
        setGajiPokok();
    }

    void setGajiPokok() {
        // Pegawai honorer mendapatkan gaji pokok 2500000
        gajiPokok = 2500000;
    }
}
