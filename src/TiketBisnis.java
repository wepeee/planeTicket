public class TiketBisnis extends Tiket {
    public TiketBisnis(String tujuan) {
        super(tujuan);
        batasBagasi += 3;
        fasilitasLain.add("Kursi berbahan kulit");
        fasilitasLain.add("Makanan lengkap");
    }

    @Override
    public float hitungHarga() {
        return super.hitungHarga() * 1.25f;
    }

    @Override
    protected String ambilHeader() {
        return buatHeader("Bisnis");
    }
}
