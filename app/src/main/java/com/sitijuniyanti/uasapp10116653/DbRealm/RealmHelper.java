package com.sitijuniyanti.uasapp10116653.DbRealm;

import android.util.Log;

import com.sitijuniyanti.uasapp10116653.Model.TemanModel;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class RealmHelper {

    Realm realm;

    public RealmHelper(Realm realm){
        this.realm = realm;
    }

    //untuk menyimpan data
    public void save(final TemanModel temanModel) {
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                if (realm != null) {
                    Log.e("Created", "Database was created");
                    Number currentIdNum = realm.where(TemanModel.class).max("id");
                    int nextId;
                    if (currentIdNum == null) {
                        nextId = 1;
                    } else {
                        nextId = currentIdNum.intValue() + 1;
                    }

                    temanModel.setId(nextId);
                    TemanModel model = realm.copyToRealm(temanModel);
                } else {
                    Log.e("ppppp", "execute : Database not Exist");
                }
            }
        });
    }

    //untuk memanggil semua data
    public List<TemanModel> getAllTeman(){
        RealmResults<TemanModel> results = realm.where(TemanModel.class).findAll();
        return results;
    }

    public void update(final Integer id, final String nim, final String nama, final String kelas,
                       final String tlp, final String email, final String sosmed ){
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                TemanModel model = realm.where(TemanModel.class)
                        .equalTo("Id", id).findFirst();
                model.setNim(nim);
                model.setNama(nama);
                model.setKelas(kelas);
                model.setTlp(tlp);
                model.setEmail(email);
                model.setSosmed(sosmed);
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Log.e("SUKSES", "Update Berhasil");
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                error.printStackTrace();
            }
        });
    }

    //untuk mengupdate data
    public void update(final Integer id, final TemanModel temanModel){
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                TemanModel model = realm.where(TemanModel.class)
                        .equalTo("Id", id).findFirst();
                model.setNim(temanModel.getNim());
                model.setNama(temanModel.getNama());
                model.setKelas(temanModel.getKelas());
                model.setTlp(temanModel.getTlp());
                model.setEmail(temanModel.getEmail());
                model.setSosmed(temanModel.getSosmed());
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                Log.e("SUKSES", "Update Berhasil");
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                error.printStackTrace();
            }
        });
    }

    public void delete(Integer id){
        final RealmResults<TemanModel> model = realm.where(TemanModel.class).equalTo("id", id).findAll();
        realm.executeTransaction(new Realm.Transaction() {
            @Override
            public void execute(Realm realm) {
                model.deleteFromRealm(0);
            }
        });

}}
