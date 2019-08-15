package com.sitijuniyanti.uasapp10116653.Model;

//*
//NIM : 10116653
//Nama : Siti Juniyanti
//Kelas : IF 13

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class TemanModel extends RealmObject implements ITemanModel {

    @PrimaryKey
    private Integer id;
    private String nim;
    private String nama;
    private String kelas;
    private String tlp;
    private String email;
    private String sosmed;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }


    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getTlp() {
        return tlp;
    }

    public void setTlp(String tlp) {
        this.tlp = tlp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSosmed() {
        return sosmed;
    }

    public void setSosmed(String sosmed) {
        this.sosmed = sosmed;
    }
}
