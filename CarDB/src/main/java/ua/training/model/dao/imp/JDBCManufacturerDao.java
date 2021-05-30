package ua.training.model.dao.imp;

import ua.training.model.dao.ManufacturerDao;
import ua.training.model.entity.Manufacturer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;

public class JDBCManufacturerDao implements ManufacturerDao {
    private Connection connection;

    public JDBCManufacturerDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Manufacturer entity) {

    }

    @Override
    public Manufacturer findById(int id) {
        return null;
    }

    @Override
    public List<Manufacturer> findAll() {
        return null;
    }

    static Manufacturer extractFromResultSet(ResultSet rs)throws Exception{
        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setId(rs.getInt("idmanufacturer"));
        manufacturer.setManufacture(rs.getString
                ("manufacture"));
        manufacturer.setDiscount(rs.getInt("discount"));
        return manufacturer;
    }

    @Override
    public void update(Manufacturer entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
