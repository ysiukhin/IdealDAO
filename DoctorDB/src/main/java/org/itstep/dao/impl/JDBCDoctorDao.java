package org.itstep.dao.impl;

import org.itstep.dao.DoctorDao;
import org.itstep.entity.Doctor;
import org.itstep.entity.Patient;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.itstep.dao.impl.UtilityDao.*;

public class JDBCDoctorDao implements DoctorDao {
    private Connection connection;

    public JDBCDoctorDao(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void create(Doctor entity) {

    }

    @Override
    public Doctor findById(int id) {
        return null;
    }

    @Override
    public List<Doctor> findAll() {
        List<Doctor> resultList = new ArrayList<>();
        Map<Integer,Doctor> doctors = new HashMap<>();
        Map<Integer,Patient> patients = new HashMap<>();

        try (Statement ps = connection.createStatement()){
            ResultSet rs = ps.executeQuery(
                    "select * from doctor " +
                    "left join doctor_has_patient using (iddoctor) " +
                    "left join patient using (idpatient)"
            );
            while ( rs.next() ){
                Doctor doctor = extractFromResultSetD(rs);
                Patient patient = extractFromResultSetP(rs);
                doctor = makeUniqueDoctor( doctors, doctor);
                patient = makeUniquePatient(patients,patient);
                doctor.getPatients().add(patient);
                patient.getDoctors().add(doctor);
                //System.out.println(driver);

                resultList.add(doctor);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return resultList;
    }

    @Override
    public void update(Doctor entity) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void close() throws Exception {

    }
}
