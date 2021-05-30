package org.itstep.dao.impl;

import org.itstep.dao.DaoFactory;
import org.itstep.dao.DoctorDao;
import org.itstep.dao.PatientDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCDaoFactory extends DaoFactory {
    @Override
    public DoctorDao createDoctorDao() {
        return new JDBCDoctorDao(getConnection());
    }
    @Override
    public PatientDao createPatientDao() {
        return new JDBCPatientDao(getConnection());
    }

    private Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/mydoctordb",
                    "root" ,
                    "root" );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
