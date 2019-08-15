package com.sitijuniyanti.uasapp10116653.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sitijuniyanti.uasapp10116653.DetailActivity;
import com.sitijuniyanti.uasapp10116653.Model.TemanModel;
import com.sitijuniyanti.uasapp10116653.Presenter.TemanPresenter;
import com.sitijuniyanti.uasapp10116653.R;
import com.sitijuniyanti.uasapp10116653.View.UpdateTemanFragment;

import java.util.List;

public class TemanAdapter extends RecyclerView.Adapter<TemanAdapter.MyViewHolder> {
    private List<TemanModel> temanModel;
    Context context;
    TemanPresenter temanPresenter;

    public TemanAdapter(TemanPresenter temanPresenter,Context context, List<TemanModel> temanModel){
        this.context = context;
        this.temanModel = temanModel;
        this.temanPresenter = temanPresenter;
    }

    public TemanAdapter(Context context, List<TemanModel> temanModel){
        this.context = context;
        this.temanModel = temanModel;
    }

    @Override
    public TemanAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_teman, parent,false);
        return new MyViewHolder(v);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(TemanAdapter.MyViewHolder holder, int position) {
        final TemanModel model = temanModel.get(position);
        holder.nim.setText(model.getNim());
        holder.nama.setText(model.getNama());
        holder.kelas.setText(model.getKelas());
        holder.telepon.setText(model.getTlp());
        holder.email.setText(model.getEmail());
        holder.sosmed.setText(model.getSosmed());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("id",String.valueOf(model.getId()));
                bundle.putString("nim",String.valueOf(model.getNim()));
                bundle.putString("nama", model.getNama());
                bundle.putString("kelas", model.getKelas());
                bundle.putString("telepon", model.getTlp());
                bundle.putString("email",model.getEmail());
                bundle.putString("sosmed",model.getSosmed());

                temanPresenter.editTeman(bundle);

            }
        });
    }

    @Override
    public int getItemCount() {
        return temanModel.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView nim, nama, kelas, telepon, email, sosmed;

        public MyViewHolder(View itemView){
            super(itemView);
            nim = itemView.findViewById(R.id.tvNim);
            nama = itemView.findViewById(R.id.tvNama);
            kelas = itemView.findViewById(R.id.tvKelas);
            telepon = itemView.findViewById(R.id.tvTlp);
            email = itemView.findViewById(R.id.tvEmail);
            sosmed = itemView.findViewById(R.id.tvSosmed);
        }
    }
}

