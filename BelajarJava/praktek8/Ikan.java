public class Ikan extends Hewan {
    public Ikan(String warna) {
        super("Ikan", 0, warna);
    }

    public String berpindahTempat() {
        return "Ikan berpindah tempat dengan cara berenang";
    }

    public String bersuara() {
        return "Tidak bersuara";
    }

    public String toString() {
        return getNamaHewan() + ", " + berpindahTempat() + ", " + bersuara();
    }
}
