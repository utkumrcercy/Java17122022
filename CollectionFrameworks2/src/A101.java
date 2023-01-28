public class A101 {

    private String calisanAd, calisanSoyad, calisanUnvan;
    private double calisanMaasi;
    private Long calisanNo, calismaGunu;

    @Override
    public String toString() {
        return "[" + calisanNo + "]" + "\t\t\t\t\t\t" + calisanAd + "\t\t" + calisanSoyad + "\t\t\t" + calisanUnvan + "\t\t\t"
                + calisanMaasi + " TL\t\t\t"+ calismaGunu + " Gün";
    }

    public A101( Long calisanNo, String calisanAd, String calisanSoyad, String calisanUnvan, double calisanMaasi,
                Long calismaGunu) {
        this.calisanAd = calisanAd;
        this.calisanSoyad = calisanSoyad;
        this.calisanUnvan = calisanUnvan;
        this.calisanMaasi = calisanMaasi;
        this.calisanNo = calisanNo;

        if (calisanUnvan != null) {
            if (calisanUnvan.contains("Mühendis")) {
                calismaGunu = 30L;
            }else{
                calismaGunu = 15L;
            }
        }
        this.calismaGunu = calismaGunu;
    }

    public String getCalisanAd() {
        return calisanAd;
    }

    public void setCalisanAd(String calisanAd) {
        this.calisanAd = calisanAd;
    }

    public String getCalisanSoyad() {
        return calisanSoyad;
    }

    public void setCalisanSoyad(String calisanSoyad) {
        this.calisanSoyad = calisanSoyad;
    }

    public String getCalisanUnvan() {
        return calisanUnvan;
    }

    public void setCalisanUnvan(String calisanUnvan) {
        this.calisanUnvan = calisanUnvan;
    }

    public double getCalisanMaasi() {
        return calisanMaasi;
    }

    public void setCalisanMaasi(double calisanMaasi) {
        this.calisanMaasi = calisanMaasi;
    }

    public Long getCalisanNo() {
        return calisanNo;
    }

    public void setCalisanNo(Long calisanNo) {
        this.calisanNo = calisanNo;
    }

    public Long getCalismaGunu() {
        return calismaGunu;
    }

    public void setCalismaGunu(Long calismaGunu) {
        this.calismaGunu = calismaGunu;
    }
}
