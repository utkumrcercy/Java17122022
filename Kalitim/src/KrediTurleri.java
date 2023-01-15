public class KrediTurleri {

    private Long taksitSayisi;
    private Boolean vadeFarkiVarMi;
    private Double faizOrani;
    private Double krediTutari;


    public Double odenecekTutar() {
        return this.krediTutari +
                (this.krediTutari / this.taksitSayisi)
                        * this.faizOrani * this.taksitSayisi;
    }


    public Long getTaksitSayisi() {
        return taksitSayisi;
    }

    public void setTaksitSayisi(Long taksitSayisi) {
        this.taksitSayisi = taksitSayisi;
    }

    public Boolean getVadeFarkiVarMi() {
        return vadeFarkiVarMi;
    }

    public void setVadeFarkiVarMi(Boolean vadeFarkiVarMi) {
        this.vadeFarkiVarMi = vadeFarkiVarMi;
    }

    public Double getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(Double faizOrani) {
        this.faizOrani = faizOrani;
    }

    public Double getKrediTutari() {
        return krediTutari;
    }

    public void setKrediTutari(Double krediTutari) {
        this.krediTutari = krediTutari;
    }
}
