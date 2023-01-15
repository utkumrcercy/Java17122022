public class Muhendis extends Calisan {


    private Double prim;

    public Double getPrim() {
        return prim;
    }

    public void setPrim(Double prim) {
        this.prim = prim;
    }


    @Override
    public String toString() {
        return "Muhendis{" +
                "tc=" + super.getTc() +
                "ad=" + super.getAd() +
                "soyad=" + super.getSoyad() +
                "prim=" + prim +
                '}';
    }
}
