package com.sitijuniyanti.uasapp10116653;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sitijuniyanti.uasapp10116653.Adapter.TemanAdapter;
import com.sitijuniyanti.uasapp10116653.Presenter.TemanPresenter;
import com.sitijuniyanti.uasapp10116653.Presenter.TemanPresenterImpl;
import com.sitijuniyanti.uasapp10116653.View.AddTemanFragment;
import com.sitijuniyanti.uasapp10116653.View.TemanView;
import com.sitijuniyanti.uasapp10116653.View.UpdateTemanFragment;

public class ListTemanFragment extends Fragment implements TemanView {

    RecyclerView recyclerView;
    TemanPresenter temanPresenter;
    View rootView;
    FragmentManager fragmentManager;
    Fragment fragment;

    public ListTemanFragment(){}



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.root,container,false);
        recyclerView = rootView.findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);

        temanPresenter = new TemanPresenterImpl(this, getActivity());

        temanPresenter.load();
        getActivity().setTitle("Daftar Teman");

        FloatingActionButton fab = rootView.findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AddTemanFragment addTemanFragment = new AddTemanFragment();
                callFragment(addTemanFragment);
            }
        });
        return rootView;


    }

    @Override
    public void onLoad(TemanAdapter temanAdapter) {
        recyclerView.setAdapter(temanAdapter);

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
        Fragment fragment = new UpdateTemanFragment();
        fragment.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_container,fragment)
                .commit();
    }

    private void callFragment(Fragment fragment){
        fragmentManager = getActivity().getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.frame_container, fragment)
                .commit();
    }
}
