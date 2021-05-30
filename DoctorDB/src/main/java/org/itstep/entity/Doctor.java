package org.itstep.entity;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private int id;
    private String name;
    private String telephone;
    private int room;

    private List<Patient> patients = new ArrayList<>();

    public Doctor() {
    }
    public Doctor(int id, String name,
                  String telephone, int room, List<Patient> patients) {
        this.id = id;
        this.name = name;
        this.telephone = telephone;
        this.room = room;
        this.patients = patients;
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
    public String getTelephone() {
        return telephone;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    public List<Patient> getPatients() {
        return patients;
    }
    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                System.identityHashCode(this)+
                " id=" + id +
                ", name='" + name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", room=" + room +
                //", patients=" + patients +
                '}';
    }
}
