package com.sitijuniyanti.uasapp10116653.View;


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
import com.sitijuniyanti.uasapp10116653.Model.TemanModel;
import com.sitijuniyanti.uasapp10116653.R;
import com.sitijuniyanti.uasapp10116653.ListTemanFragment;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * A simple {@link Fragment} subclass.
 */
public class AddTemanFragment extends Fragment implements View.OnClickListener {

    View view;
    Button btnSimpan, btnTampil, btnLogout;
    EditText nim, nama, kelas, telepon, email, sosmed;
    String sNama, sNim, sKelas, sTlp, sEmail, sSosmed;
    Realm realm;
    RealmHelper realmHelper;
    TemanModel temanModel;
    FragmentManager fragmentManager;



    public AddTemanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_add_teman, container, false);
        //Inisialisasi
        btnSimpan = view.findViewById(R.id.btnSimpan);
        btnTampil = view.findViewById(R.id.btnTampil);

        nim = view.findViewById(R.id.nim);
        nama = view.findViewById(R.id.nama);
        kelas = view.findViewById(R.id.kelas);
        telepon = view.findViewById(R.id.telepon);
        email = view.findViewById(R.id.email);
        sosmed = view.findViewById(R.id.sosmed);


        //Set up Realm
        Realm.init(getActivity());
        RealmConfiguration configuration = new RealmConfiguration.Builder().build();
        realm = Realm.getInstance(configuration);

        btnSimpan.setOnClickListener(this);
        btnTampil.setOnClickListener(this);
        return view;

    }

    @Override
    public void onClick(View v) {
        if (v == btnSimpan) {
            sNim = nim.getText().toString();
            sNama = nama.getText().toString();
            sKelas = kelas.getText().toString();
            sTlp = telepon.getText().toString();
            sEmail = email.getText().toString();
            sSosmed = sosmed.getText().toString();

            if (!sNim.equals("") && !sNama.isEmpty() && !sKelas.isEmpty() && !sTlp.isEmpty() &&
                !sEmail.isEmpty() && !sSosmed.isEmpty()) {
                temanModel = new TemanModel();
                temanModel.setNim(sNim);
                temanModel.setNama(sNama);
                temanModel.setKelas(sKelas);
                temanModel.setTlp(sTlp);
                temanModel.setEmail(sEmail);
                temanModel.setSosmed(sSosmed);

                realmHelper = new RealmHelper(realm);
                realmHelper.save(temanModel);

                Toast.makeText(getActivity(), "Berhasil Disimpan!", Toast.LENGTH_SHORT).show();

                nim.setText("");
                nama.setText("");
                kelas.setText("");
                telepon.setText("");
                email.setText("");
                sosmed.setText("");
            } else {
                Toast.makeText(getActivity(), "Terdapat inputan yang kosong", Toast.LENGTH_SHORT).show();
            }
        } else if (v == btnTampil) {
            ListTemanFragment root = new ListTemanFragment();
            fragmentManager = getActivity().getSupportFragmentManager();
            fragmentManager.beginTransaction()
                    .replace(R.id.frame_container, root)
                    .commit();
        }

    }


}
