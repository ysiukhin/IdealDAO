package org.itstep.entity;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    private int id;
    private String name;
    private String address;

    private List<Doctor> doctors = new ArrayList<>();

    public Patient() {
    }
    public Patient(int id, String name,
                   String address, List<Doctor> doctors) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.doctors = doctors;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
    public void setDoctors(List<Doctor> doctors) {
        this.doctors = doctors;
    }

    @Override
    public String toString() {
        return "Patient{" +
                System.identityHashCode(this)+
                " id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                //", doctors=" + doctors +
                '}';
    }
}
