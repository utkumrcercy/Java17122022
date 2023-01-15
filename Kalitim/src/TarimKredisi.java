public class TarimKredisi extends KrediTurleri {

    @Override // KrediTurleri sınıfındaki odenecekTutar metodunu ezerek kendi hesaplamamızı yapmamızı sağlar
    public Double odenecekTutar() {
        return getKrediTutari() + (getKrediTutari() /
                getTaksitSayisi()) * getFaizOrani() * 12L;
    }
}
