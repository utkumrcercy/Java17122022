import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Veritabanındaki tüm işlemleri bu sınıf
 * yapar
 */
public class UserDao {


    private Connection connection;

    public UserDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public User kullaniciEkle(User user) {

        String sqlString = "INSERT INTO users(id,username, password)  VALUES(?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sqlString);
            stmt.setLong(1, user.getId());
            stmt.setString(2, user.getUsername());
            stmt.setString(3, user.getPassword());

            // SQL i çalıştır
            stmt.execute();
            stmt.close();


        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        return user;
    }

    public List<User> tumKullanicilariGetir() {

        List<User> userList = new ArrayList<>();
        try {

            String sqlString = "SELECT * FROM users";
            PreparedStatement stmt = connection.prepareStatement(sqlString);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                User user = new User();
                user.setId(rs.getLong("id"));
                user.setPassword(rs.getString("password"));
                user.setUsername(rs.getString("username"));
                userList.add(user);
            }
            stmt.close();


        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }


        return userList;
    }

    public Boolean kullaniciSil(Long kullaniciId) {

        Boolean durum = Boolean.FALSE;
        String sqlString = "DELETE FROM users where id =?";
        try {

            PreparedStatement stmt = connection.prepareStatement(sqlString);
            stmt.setLong(1, kullaniciId);
            stmt.execute();
            stmt.close();
            durum = Boolean.TRUE;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return durum;
    }

    public User kullaniciGuncelle(User user) {

        String sqlString = "UPDATE users SET username=?, password=? where id = ?";
        try {

            PreparedStatement stmt = connection.prepareStatement(sqlString);
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setLong(3, user.getId());
            stmt.execute();
            stmt.close();
            return user;

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    public User kullaniciyiBul(Long id) {
        String sqlString = "Select * from users where id = ?";
        User user = null;
        try {

            PreparedStatement stmt = connection.prepareStatement(sqlString);
            stmt.setLong(1, id);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user= new User();
                user.setId(rs.getLong("id"));
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
            stmt.close();
            return user;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
