package ua.training.model.dao.implement;

import ua.training.model.dao.DriverDao;
import ua.training.model.entity.Car;
import ua.training.model.entity.Driver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class JDBCDriverDao implements DriverDao {
    private Connection connection;

    public JDBCDriverDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Driver entity) {

    }

    @Override
    public Driver findById(int id) {
        return null;
    }

    static Driver extractFromResultSet(ResultSet rs)
            throws SQLException {
        Driver result = new Driver();

        result.setIddriver(rs.getInt("driver_id") );
        result.setName( rs.getString("driver.name") );
        result.setTelephone( rs.getString("telephone"));


        return result;
    }

    @Override
    public List<Driver> findAll() {
        return null;
    }

    @Override
    public void update(Driver entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
