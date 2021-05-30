package ua.training.model.dao.imp;

import ua.training.model.dao.ShopDao;
import ua.training.model.entity.Shop;

import java.sql.Connection;
import java.util.List;

public class JDBCShopDao implements ShopDao {
    private Connection connection;

    public JDBCShopDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Shop entity) {

    }

    @Override
    public Shop findById(int id) {
        return null;
    }

    @Override
    public List<Shop> findAll() {
        return null;
    }

    @Override
    public void update(Shop entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
