package com.sitijuniyanti.uasapp10116653.View;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.sitijuniyanti.uasapp10116653.DbRealm.RealmHelper;
import com.sitijuniyanti.uasapp10116653.DetailActivity;
import com.sitijuniyanti.uasapp10116653.ListTemanFragment;
import com.sitijuniyanti.uasapp10116653.MainActivity;
import com.sitijuniyanti.uasapp10116653.Model.TemanModel;
import com.sitijuniyanti.uasapp10116653.R;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * A simple {@link Fragment} subclass.
 */
public class UpdateTemanFragment extends Fragment implements TemanViewUpdate,View.OnClickListener {
    View view;
    Fragment fragment;
    FragmentManager fragmentManager;
    EditText etNim, etNama, etKelas, etTlp, etEmail, etSosmed;
    String nim, nama, kelas, telepon, email, sosmed;
    Integer id;
    Button btn_ubah, btn_hapus, btn_kembali;
    RealmHelper realmHelper;
    Realm realm;

    public UpdateTemanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view = inflater.inflate(R.layout.fragment_update_teman, container, false);

        // Set up
        Realm.init(getActivity());
        RealmConfiguration configuration = new RealmConfiguration.Builder().build();
        realm = Realm.getInstance(configuration);
        realmHelper = new RealmHelper(realm);

        // Inisialisasi
        etNim = view.findViewById(R.id.etNim);
        etNama = view.findViewById(R.id.etNama);
        etKelas = view.findViewById(R.id.etKelas);
        etTlp = view.findViewById(R.id.etTelepon);
        etEmail = view.findViewById(R.id.etEmail);
        etSosmed = view.findViewById(R.id.etSosmed);



        btn_ubah = view.findViewById(R.id.btnUpdate);
        btn_hapus = view.findViewById(R.id.btnHapus);
        btn_kembali = view.findViewById(R.id.btnCancel);

        id = Integer.parseInt(getArguments().getString("id"));
        nim = getArguments().getString("nim");
        nama = getArguments().getString("nama");
        kelas = getArguments().getString("kelas");
        telepon = getArguments().getString("telepon");
        email = getArguments().getString("email");
        sosmed = getArguments().getString("sosmed");


        etNim.setText(nim);
        etNama.setText(nama);
        etKelas.setText(kelas);
        etTlp.setText(telepon);
        etEmail.setText(email);
        etSosmed.setText(sosmed);

        btn_kembali.setOnClickListener(this);
        btn_hapus.setOnClickListener(this);
        btn_ubah.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        if (v == btn_ubah){

            Realm.init(getActivity());
            RealmConfiguration configuration = new RealmConfiguration.Builder().build();
            realm = Realm.getInstance(configuration);
            realmHelper = new RealmHelper(realm);

            TemanModel temanModel = new TemanModel();
            temanModel.setNim(etNim.getText().toString());
            temanModel.setNama(etNama.getText().toString());
            temanModel.setKelas(etKelas.getText().toString());
            temanModel.setTlp(etTlp.getText().toString());
            temanModel.setEmail(etEmail.getText().toString());
            temanModel.setSosmed(etSosmed.getText().toString());

//            realmHelper = new RealmHelper(realm);

            realmHelper.update(id, temanModel);
            Toast.makeText(getActivity(), "Update Success", Toast.LENGTH_SHORT).show();
//            etNim.setText("");
//            etNama.setText("");
//            etKelas.setText("");
//            etTlp.setText("");
//            etEmail.setText("");
//            etSosmed.setText("");

//            callFragment(new ListTemanFragment());

        }else if (v == btn_hapus) {
            realmHelper.delete(id);
            Toast.makeText(getActivity(), "Delete Success", Toast.LENGTH_SHORT).show();

        }else if (v == btn_kembali) {
            callFragment(new ListTemanFragment());

        }
    }

    private void callFragment(Fragment fragment){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_container, fragment)
                .commit();
    }
}
