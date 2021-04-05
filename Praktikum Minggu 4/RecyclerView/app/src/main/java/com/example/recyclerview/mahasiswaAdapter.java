package com.example.recyclerview;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class mahasiswaAdapter extends RecyclerView.Adapter<mahasiswaAdapter.mahasiswaViewHolder>{
    private ArrayList<mahasiswa> dataList;

    public mahasiswaAdapter(ArrayList<mahasiswa> dataList){
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public mahasiswaViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.layout_cardview, parent, false);
        return new mahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull mahasiswaViewHolder holder, int position) {
        holder.txtName.setText(dataList.get(position).getName());
        holder.txtNpm.setText(dataList.get(position).getNpm());
        holder.txtHp.setText(dataList.get(position).getHp());
    }

    @Override
    public int getItemCount(){
        return (dataList !=null) ? dataList.size() : 0;
    }

    public static class mahasiswaViewHolder extends RecyclerView.ViewHolder{
        private TextView txtName, txtNpm, txtHp;

        public mahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txt_name_mahasiswa);
            txtNpm = (TextView) itemView.findViewById(R.id.txt_npm_mahasiswa);
            txtHp = (TextView) itemView.findViewById(R.id.txt_hp_mahasiswa);
        }
    }
}
