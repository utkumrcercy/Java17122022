public class PostgreSQLDB implements IDataBase{

    @Override
    public void login() {
        System.out.println("PostgreSQL giriş yapıldı");

    }

    @Override
    public void add() {
        System.out.println("PostgreSQL ekleme yapıldı");

    }

    @Override
    public void delete() {
        System.out.println("PostgreSQL silme yapıldı");

    }

    @Override
    public void get() {
        System.out.println("PostgreSQL kayıt getirme yapıldı");

    }

    @Override
    public void update() {
        System.out.println("PostgreSQL güncelleme yapıldı");
    }
}
