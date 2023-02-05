public class Main {
    public static void main(String[] args) {

        Uyeler ahmet = new Uyeler();
        ahmet.setAd("Ahmet");
        ahmet.setRolu(Roller.MEMBER);
        ahmet.setYoneticiTuru(YoneticiTurleri.MODERATOR);

        System.out.println(ahmet);

        if (Roller.MEMBER.equals(ahmet.getRolu())) {
            System.out.println("Ahmetin rolü Üyedir");
        }
    }
}