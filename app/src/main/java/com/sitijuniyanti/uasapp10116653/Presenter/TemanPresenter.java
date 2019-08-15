package com.sitijuniyanti.uasapp10116653.Presenter;

import android.os.Bundle;

import com.sitijuniyanti.uasapp10116653.Model.TemanModel;
import com.sitijuniyanti.uasapp10116653.View.TemanView;

public interface TemanPresenter {

    void save(TemanModel teman);

    void update(final Integer id, final String nim, final String nama,
                final String kelas, final String tlp, final String email, final String sosmed);

    void delete(int id);

    void load();

    void editTeman(Bundle bundle);

}
