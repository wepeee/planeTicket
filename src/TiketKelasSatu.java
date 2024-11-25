public class TiketKelasSatu extends Tiket {
    public TiketKelasSatu(String tujuan) {
        super(tujuan);

        batasBagasi += 4;
        fasilitasLain.add("Kamar tidur pribadi");
        fasilitasLain.add("Makanan mewah lengkap");
        fasilitasLain.add("Dinding peredam suara");
        fasilitasLain.add("Sampanye gratis");
        fasilitasLain.add("Fasilitas kamar mandi pribadi");
    }

    @Override
    public float hitungHarga() {
        return super.hitungHarga() * 1.5f;
    }

    @Override
    protected String ambilHeader() {
        return buatHeader("Kelas Satu");
    }
}
