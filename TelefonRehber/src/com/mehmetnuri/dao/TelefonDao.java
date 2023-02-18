package com.mehmetnuri.dao;

import com.mehmetnuri.db.ConnectionFactory;
import com.mehmetnuri.entity.TelefonEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TelefonDao {

    private Connection connection;

    public TelefonDao() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public TelefonEntity createTelefon(TelefonEntity entity) {

        String sqlString = "INSERT INTO telefon(seri_no, model,marka) " +
                " VALUES (?,?,?)";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlString);
            ps.setString(1, entity.getSeriNo());
            ps.setString(2, entity.getModel());
            ps.setString(3, entity.getMarka());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return entity;
    }

    public Boolean deleteTelefon(Long id) {
        Boolean durum = Boolean.FALSE;

        String sqlString = "DELETE FROM telefon Where id = ?";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlString);
            ps.setLong(1, id);
            ps.execute();
            ps.close();
            durum = Boolean.TRUE;
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return durum;
    }


    public TelefonEntity updateTelefon(TelefonEntity entity, Long id) {
        String sqlString = "UPDATE  telefon SET seri_no=?, model=?, marka=? WHERE id = ?";
        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlString);
            ps.setString(1, entity.getSeriNo());
            ps.setString(2, entity.getModel());
            ps.setString(3, entity.getMarka());
            ps.setLong(4, id);

            ps.execute();
            ps.close();
            return entity;

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
    }


    public TelefonEntity findTelefonById(Long id) {
        TelefonEntity entity = null;
        String sqlString = "Select * from telefon where id = ?";
        try {

            PreparedStatement ps = this.connection.prepareStatement(sqlString);
            ps.setLong(1, id);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                entity.setId(rs.getLong("id"));
                entity.setMarka(rs.getString("marka"));
                entity.setModel(rs.getString("model"));
                entity.setSeriNo(rs.getString("seri_no"));

            }
            ps.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }
        return entity;
    }

    public List<TelefonEntity> findAllTelefon() {
        List<TelefonEntity> telefonList = new ArrayList<>();

        String sqlString = "Select * from telefon";

        try {
            PreparedStatement ps = this.connection.prepareStatement(sqlString);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                TelefonEntity entity = new TelefonEntity();
                entity.setId(rs.getLong("id"));
                entity.setMarka(rs.getString("marka"));
                entity.setModel(rs.getString("model"));
                entity.setSeriNo(rs.getString("seri_no"));
                telefonList.add(entity);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        return telefonList;
    }
}
