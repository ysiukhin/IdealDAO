package org.itstep.dao.impl;

import org.itstep.dao.PatientDao;
import org.itstep.entity.Patient;

import java.sql.Connection;
import java.util.List;

public class JDBCPatientDao implements PatientDao {
    private Connection connection;

    public JDBCPatientDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Patient entity) {

    }

    @Override
    public Patient findById(int id) {
        return null;
    }

    @Override
    public List<Patient> findAll() {
        return null;
    }

    @Override
    public void update(Patient entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
