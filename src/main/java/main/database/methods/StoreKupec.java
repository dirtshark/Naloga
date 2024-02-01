package main.database.methods;

import main.database.entities.Kupec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

@Service
public class StoreKupec {

    private final DataSource dataSource;

    @Autowired
    public StoreKupec(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertKupec(Kupec kupec) throws Exception {
        Connection connection = null;
        try {
            String sql =  " INSERT INTO kupec (uuid, ime, priimek, emso, davcna) " +
                    " VALUES (?, ?, ?, ?, ?) ";
            connection = dataSource.getConnection();
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, kupec.getUuid());
                statement.setString(2, kupec.getIme());
                statement.setString(3, kupec.getPriimek());
                statement.setString(4, kupec.getEmso());
                statement.setString(5, kupec.getDavcna());

                statement.executeUpdate();
            }
        }catch (Exception e){
            throw new Exception("error while inserting kupec into db: " + e);
        }finally {
            if (connection != null){
                connection.close();
            }
        }
    }

}
