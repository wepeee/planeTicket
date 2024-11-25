public class TiketEkonomi extends Tiket {
    public TiketEkonomi(String tujuan) {
        super(tujuan);
    }

    @Override
    public float hitungHarga() {
        return super.hitungHarga() * 0.9f;
    }

    @Override
    protected String ambilHeader() {
        return buatHeader("Ekonomi");
    }
}
