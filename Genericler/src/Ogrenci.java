public class Ogrenci {

    private Long no;
    private String ad;

    @Override
    public String toString() {
        return "Ogrenci{" +
                "no=" + no +
                ", ad='" + ad + '\'' +
                '}';
    }

    public Long getNo() {
        return no;
    }

    public void setNo(Long no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
