package org.itstep.dao.impl;

import org.itstep.entity.Doctor;
import org.itstep.entity.Patient;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class UtilityDao {
    static Doctor extractFromResultSetD(ResultSet rs)
            throws SQLException {
        Doctor result = new Doctor();

        result.setId(rs.getInt("iddoctor") );
        result.setName( rs.getString("doctor.name") );
        result.setTelephone( rs.getString("telephone"));
        result.setRoom(rs.getInt("cabinet"));

        return result;
    }

    static Patient extractFromResultSetP(ResultSet rs)
            throws SQLException {
        Patient result = new Patient();

        result.setId(rs.getInt("idpatient") );
        result.setName( rs.getString("patient.name") );
        result.setAddress( rs.getString("address"));

        return result;
    }

    static Doctor makeUniqueDoctor(Map<Integer, Doctor> doctors,
                                   Doctor doctor) {
        doctors.putIfAbsent(doctor.getId(), doctor);
        return doctors.get(doctor.getId());
    }

    static Patient makeUniquePatient(
            Map<Integer, Patient> patients, Patient patient) {
        patients.putIfAbsent(patient.getId(), patient);
        return patients.get(patient.getId());
    }
}
