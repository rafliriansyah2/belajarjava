public class Burung extends Hewan {
    public Burung(String warna) {
        super("Burung", 2, warna);
    }

    public String berpindahTempat() {
        return "Burung berpindah tempat dengan cara terbang";
    }

    public String bersuara() {
        return "bersuara dengan berkicau";
    }

    public String toString() {
        return getNamaHewan() + ", " + berpindahTempat() + ", " + bersuara();
    }
}
