package com.sitijuniyanti.uasapp10116653.Presenter;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.sitijuniyanti.uasapp10116653.Adapter.TemanAdapter;
import com.sitijuniyanti.uasapp10116653.DbRealm.RealmHelper;
import com.sitijuniyanti.uasapp10116653.Model.TemanModel;
import com.sitijuniyanti.uasapp10116653.View.TemanView;

import java.util.ArrayList;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmResults;

public class TemanPresenterImpl implements TemanPresenter {

    Realm realm;
    TemanAdapter temanAdapter;
    TemanView temanView;
    List<TemanModel> temanModels;
    Context context;
    RealmHelper realmHelper;

    public TemanPresenterImpl(TemanView temanView, Context context){
        this.temanView = temanView;
        this.context = context;
        inisialisasi();

    }

    public TemanPresenterImpl(TemanView temanView){
        this.temanView = temanView;
        inisialisasi();

    }

    @Override
    public void save(TemanModel teman){
        realmHelper.save(teman);
    }

    @Override
    public void update (final Integer id, final String nim, final String nama,
                       final String kelas, final String tlp, final String email, final String sosmed) {
        realmHelper.update(id,nim,nama,kelas,tlp,email,sosmed);

    }

    @Override
    public void delete(int id) {
        realmHelper.delete(id);
        Toast.makeText(context, "Data teman berhasil dihapus",Toast.LENGTH_SHORT).show();
        inisialisasi();
        load();
    }


    @Override
    public void load() {
        temanAdapter = new TemanAdapter(this,context,temanModels);
        temanView.onLoad(temanAdapter);
    }

    @Override
    public void editTeman(Bundle bundle) {
        temanView.UpdateTeman(bundle);

    }


    public void inisialisasi(){
        Realm.init(context);
        RealmConfiguration configuration= new RealmConfiguration.Builder().build();
        realm = Realm.getInstance(configuration);
        realmHelper = new RealmHelper(realm);
        temanModels = new ArrayList<>();
        temanModels = realmHelper.getAllTeman();

    }


}
