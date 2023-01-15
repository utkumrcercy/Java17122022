public class OraleDB implements IDataBase{
    @Override
    public void login() {
        System.out.println("Oracle giriş yapıldı");

    }

    @Override
    public void add() {
        System.out.println("Oracle ekleme yapıldı");

    }

    @Override
    public void delete() {
        System.out.println("Oracle silme yapıldı");

    }

    @Override
    public void get() {
        System.out.println("Oracle kayıt getirme yapıldı");

    }

    @Override
    public void update() {
        System.out.println("Oracle güncelleme yapıldı");

    }
}
