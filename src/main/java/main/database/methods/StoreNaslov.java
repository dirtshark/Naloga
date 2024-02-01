package main.database.methods;

import main.database.entities.Naslov;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.*;

@Service
public class StoreNaslov {

    private final DataSource dataSource;

    @Autowired
    public StoreNaslov(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertNaslov(Naslov naslov) throws Exception {
        Connection connection = null;
        naslov.setId_kupec(1);

        try {
            String sql =  " INSERT INTO naslov (naziv, ustanova, ime, priimek, ulica, hisna_st, postna_st, posta, kraj, drzava, privzet, id_kupec) " +
                          " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, naslov.getNaziv());
                statement.setString(2, naslov.getUstanova());
                statement.setString(3, naslov.getIme());
                statement.setString(4, naslov.getPriimek());
                statement.setString(5, naslov.getUlica());
                statement.setInt(6, naslov.getHisna_st());
                statement.setInt(7, naslov.getPostna_st());
                statement.setString(8, naslov.getPosta());
                statement.setString(9, naslov.getKraj());
                statement.setString(10, naslov.getDrzava());
                statement.setBoolean(11, naslov.isPrivzet());
                statement.setInt(12, naslov.getId_kupec());

                statement.executeUpdate();
            }
        }catch (Exception e){
            throw new Exception("error while inserting naslov into db: " + e);
        }finally {
            if (connection != null){
                connection.close();
            }
        }
    }
}
