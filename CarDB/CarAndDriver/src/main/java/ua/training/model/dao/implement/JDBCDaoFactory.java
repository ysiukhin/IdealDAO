package ua.training.model.dao.implement;

import ua.training.model.dao.CarDao;
import ua.training.model.dao.DaoFactory;
import ua.training.model.dao.DriverDao;

import javax.naming.InitialContext;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.sql.DataSource;

public class JDBCDaoFactory extends DaoFactory {

    private DataSource dateSource;

    public JDBCDaoFactory() {
        try {
            InitialContext ic = new InitialContext();
            dateSource = (DataSource) ic.lookup( "java:comp/env/jdbc/cars");
           /* return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydriverdb",
                    "root" ,
                    "root" );*/
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

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
            return dateSource.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
