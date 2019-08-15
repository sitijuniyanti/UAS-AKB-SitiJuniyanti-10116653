package com.sitijuniyanti.uasapp10116653.View;

import android.os.Bundle;

import com.sitijuniyanti.uasapp10116653.Adapter.TemanAdapter;
import com.sitijuniyanti.uasapp10116653.Model.TemanModel;

import java.util.List;

public interface TemanView {

    void onLoad(TemanAdapter temanAdapter);

    void onSave();

    void onDelete();

    void onUpdate();

    void UpdateTeman(Bundle bundle);
}
