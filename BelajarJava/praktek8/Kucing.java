public class Kucing extends Hewan {
    public Kucing(String warna) {
        super("Kucing", 4, warna);
    }

    public String berpindahTempat() {
        return "Kucing berpindah tempat dengan cara berjalan";
    }

    public String bersuara() {
        return "bersuara dengan mengeong";
    }

    public String toString() {
        return getNamaHewan() + ", " + berpindahTempat() + ", " + bersuara();
    }
}
