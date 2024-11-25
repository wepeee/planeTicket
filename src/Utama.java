public class Utama {
    public static void main(String[] args) {
        TiketEkonomi tiketEkonomi = new TiketEkonomi("Bali");
        System.out.println(tiketEkonomi.ambilInformasi());
        System.out.println();

        TiketBisnis tiketBisnis = new TiketBisnis("Bali");
        System.out.println(tiketBisnis.ambilInformasi());
        System.out.println();

        TiketKelasSatu tiketKelasSatu = new TiketKelasSatu("Bali");
        System.out.println(tiketKelasSatu.ambilInformasi());
        System.out.println();
    }
}
