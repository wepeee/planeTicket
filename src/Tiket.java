import java.util.ArrayList;
import java.util.List;

public abstract class Tiket {
    private float hargaDasar = 100.0f;
    protected int batasBagasi = 2;
    protected List<String> fasilitasLain = new ArrayList<>();
    protected String tujuan;

    public Tiket(String tujuan) {
        this.tujuan = tujuan;
    }

    public float hitungHarga() {
        return hargaDasar;
    }

    protected abstract String ambilHeader();

    public String ambilInformasi() {
        String informasi = ambilHeader();
        informasi += "\nTujuan: " + tujuan;
        informasi += "\nHarga: " + hitungHarga() + " USD";
        informasi += "\nBatas Bagasi: " + batasBagasi + "kg";

        if (fasilitasLain.size() > 0) {
            informasi += "\nFasilitas Lain:";
            for (int i = 0; i < fasilitasLain.size(); i++) {
                informasi += "\n" + (i + 1) + ". " + fasilitasLain.get(i);
            }
        }

        return informasi;
    }

    public static String buatHeader(String header) {
        return "==============================[" + header + "]==============================";
    }
}
