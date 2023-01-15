public class Kamyon extends Arac implements IKamyon{

    private Long depoSayisi;

    @Override
    public void bilgiVer() {
        System.out.println("Marka: " + getMarka() + " Model: " + getModel()
                + " Fiyat: " + getFiyat() + " Renk: " + getRenk() +
                " Depo Sayısı: " + this.depoSayisi);
    }

    @Override
    public void ozellikYaz() {
        this.bilgiVer();
    }

    @Override
    public void markaYaz() {
        super.markaYaz();
    }

    public Long getDepoSayisi() {
        return depoSayisi;
    }

    public void setDepoSayisi(Long depoSayisi) {
        this.depoSayisi = depoSayisi;
    }

    @Override
    public void depoSayisiYaz() {
        System.out.println(this.depoSayisi);

    }
}
