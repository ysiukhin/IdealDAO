package ua.training.model.dao.implement;

import ua.training.model.dao.CarDao;
import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.DriverDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {
    @Override
    public CarDao createCarDao() {
        return new JDBCCarDao(getConnection());
    }
    @Override
    public DriverDao createDriverDao() {
        return new JDBCDriverDao(getConnection());
    }

    private Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydriverdb",
                    "root" ,
                    "root" );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
