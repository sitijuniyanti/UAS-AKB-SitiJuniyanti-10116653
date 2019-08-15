package com.sitijuniyanti.uasapp10116653;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.sitijuniyanti.uasapp10116653.Adapter.TemanAdapter;
import com.sitijuniyanti.uasapp10116653.DbRealm.RealmHelper;
import com.sitijuniyanti.uasapp10116653.Model.TemanModel;
import com.sitijuniyanti.uasapp10116653.Presenter.TemanPresenter;
import com.sitijuniyanti.uasapp10116653.Presenter.TemanPresenterImpl;
import com.sitijuniyanti.uasapp10116653.R;
import com.sitijuniyanti.uasapp10116653.SharedPreferences.LoginActivity;
import com.sitijuniyanti.uasapp10116653.SharedPreferences.Preferences;
import com.sitijuniyanti.uasapp10116653.View.TemanView;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class MainActivity extends AppCompatActivity implements TemanView {

    RecyclerView recyclerView;
    TemanPresenter temanPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onLoad(TemanAdapter temanAdapter) {
    }

    @Override
    public void onSave() {

    }

    @Override
    public void onDelete() {

    }

    @Override
    public void onUpdate() {

    }

    @Override
    public void UpdateTeman(Bundle bundle) {

    }
}