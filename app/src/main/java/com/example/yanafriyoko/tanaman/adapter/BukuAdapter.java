package com.example.yanafriyoko.tanaman.adapter;


import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.yanafriyoko.tanaman.R;
import com.example.yanafriyoko.tanaman.activity.EditActivity;
import com.example.yanafriyoko.tanaman.model.Buku;

import java.util.List;

public class BukuAdapter extends RecyclerView.Adapter<BukuAdapter.MyViewHolder> {
    List<Buku> mBukuList;

    public BukuAdapter(List<Buku> bukuList) {
        mBukuList = bukuList;
    }
    @Override
    public BukuAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.buku_list, parent, false);
        BukuAdapter.MyViewHolder mViewHolder = new BukuAdapter.MyViewHolder(mView);
        return mViewHolder;
    }
    @Override
    public void onBindViewHolder(BukuAdapter.MyViewHolder holder, final int position) {
        holder.mTextViewIdBuku.setText("ID Tanaman = " + mBukuList.get(position).getId_buku());
        holder.mTextViewNamaBarang.setText("Nama = " + mBukuList.get(position).getNama_buku());
        holder.mTextViewHargaBarang.setText("Jenis = " + mBukuList.get(position).getHarga_buku());
        holder.mTextViewTotalBarang.setText("Harga = " + mBukuList.get(position).getTotal());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(view.getContext(), EditActivity.class);
                mIntent.putExtra("id_tanaman", mBukuList.get(position).getId_buku());
                mIntent.putExtra("nama_tanaman", mBukuList.get(position).getNama_buku());
                mIntent.putExtra("jenis_tanaman", mBukuList.get(position).getHarga_buku());
                mIntent.putExtra("harga_tanaman", mBukuList.get(position).getTotal());
                view.getContext().startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mBukuList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextViewIdBuku, mTextViewNamaBarang,mTextViewHargaBarang,mTextViewTotalBarang;

        public MyViewHolder(View itemView) {
            super(itemView);
            mTextViewIdBuku = (TextView) itemView.findViewById(R.id.id_buku);
            mTextViewNamaBarang = (TextView) itemView.findViewById(R.id.nama_buku);
            mTextViewHargaBarang = (TextView) itemView.findViewById(R.id.harga_buku);
            mTextViewTotalBarang = (TextView) itemView.findViewById(R.id.total_buku);
        }
    }
}
