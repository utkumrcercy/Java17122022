public class EmployeManager <benimOzelTipim>{

    private final String sirketKisaltmasi = "COMP";
    private String kayitNo;
    String  isim, soyisim;
    benimOzelTipim maas;

    public String getKayitNo() {

        int i = isim.length() / 2 + 1;
        int v = soyisim.length() / 2;
        this.kayitNo =  sirketKisaltmasi + "-"+
                isim.substring(i) + soyisim.substring(v);
        return kayitNo.toUpperCase();

    }
}
