public class Pegawai {
    protected String NIP; // Nomor Induk Pegawai
    protected String nama;
    protected String alamat;
    protected char jenisKelamin; // L = Laki-laki; P = Perempuan
    protected int umur;
    protected String agama;
    protected float gajiPokok;
    protected float tunjangan;
    protected String[] namaAnggotaKeluarga;

    // Constructor 1
    Pegawai() {
        this.NIP = "";
        this.nama = "";
        this.alamat = "";
        this.jenisKelamin = 'L';
        this.umur = 0;
        this.agama = "";
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.namaAnggotaKeluarga = new String[0];
    }

    // Constructor 2
    Pegawai(String NIP, String nama, String alamat, char jenisKelamin, int umur) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.umur = jenisKelamin;
        this.agama = "";
        this.gajiPokok = 0;
        this.tunjangan = 0;
        this.namaAnggotaKeluarga = new String[0];
    }

    // Constructor 3
    Pegawai(String NIP, String nama, String alamat, char jenisKelamin, int umur, String kodeAgama, float gajiPokok,
            float tunjangan, String[] namaAnggotaKeluarga) {
        this.NIP = NIP;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
        this.umur = jenisKelamin;
        this.agama = kodeAgama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = tunjangan;
        this.namaAnggotaKeluarga = namaAnggotaKeluarga;
    }

    // getter method
    public String getNIP() {
        return this.NIP;
    }

    public String getNama() {
        return this.nama;
    }

    public String getAlamat() {
        return this.alamat;
    }

    public char getJenisKelamin() {
        return this.jenisKelamin;
    }

    public int getUmur() {
        return this.umur;
    }

    public String getAgama() {
        return agama;
    }

    public float getGajiPokok() {
        return this.gajiPokok;
    }

    public float getTunjangan() {
        return this.tunjangan;
    }

    public String[] getNamaAnggotaKeluarga() {
        return this.namaAnggotaKeluarga;
    }

    // setter method
    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String NIP) {
        this.alamat = alamat;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public void setGajiPokok(float gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan(float tunjangan) {
        this.tunjangan = tunjangan;
    }

    public void setNamaAnggotaKeluarga(String[] namaAnggotaKeluarga) {
        this.namaAnggotaKeluarga = namaAnggotaKeluarga;
    }
}
