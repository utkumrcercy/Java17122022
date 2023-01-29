public class Muhendis  extends Calisanlar{

    private boolean arabaVarmi;
    private boolean tatilVarmi;
    private Double prim;

    public boolean isArabaVarmi() {
        return arabaVarmi;
    }

    public void setArabaVarmi(boolean arabaVarmi) {
        this.arabaVarmi = arabaVarmi;
    }

    public boolean isTatilVarmi() {
        return tatilVarmi;
    }

    public void setTatilVarmi(boolean tatilVarmi) {
        this.tatilVarmi = tatilVarmi;
    }

    public Double getPrim() {
        return prim;
    }

    public void setPrim(Double prim) {
        this.prim = prim;
    }

    @Override
    public String toString() {
        return "Muhendis{" +
                "ad=" + getAd() +
                "soyad=" + getSoyadi() +
                "tc=" + getTc() +
                "arabaVarmi=" + arabaVarmi +
                ", tatilVarmi=" + tatilVarmi +
                ", prim=" + prim +
                '}';
    }
}
