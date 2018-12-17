package com.v2.two.appmanager;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class KhachHangAdapter extends RecyclerView.Adapter<KhachHangAdapter.ViewHolder> {
    private List<KhachHang> data = new ArrayList<>();
    private Context context;
    private String keyHangXe;

    public KhachHangAdapter(List<KhachHang> data) {
        this.data = data;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_recycle, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final KhachHang khachHang = data.get(position);
        holder.tvName.setText(khachHang.getTen().toUpperCase());
        holder.tvNgay.setText(khachHang.getKey().substring(15));
        holder.tvSDT.setText("Số ĐT: " + khachHang.getSoDT());
        holder.tvHangXe.setText("Hãng xe: " + khachHang.getHangXe());
        holder.tvTien.setText("Số tiền: "+khachHang.getSoTien());
        holder.tvThanhPho.setText("Tỉnh: " + khachHang.getTinh());
        holder.tvTinhTrangXe.setText("Tình trạng xe: " + khachHang.getTinhTrangXe());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvNgay, tvSDT, tvTien, tvHangXe, tvTinhTrangXe, tvThanhPho;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            tvNgay = (TextView) itemView.findViewById(R.id.tv_ngay);
            tvSDT = (TextView) itemView.findViewById(R.id.tv_sdt);
            tvTien = (TextView) itemView.findViewById(R.id.tv_tien);
            tvHangXe = (TextView) itemView.findViewById(R.id.tv_hang_xe);
            tvTinhTrangXe = (TextView) itemView.findViewById(R.id.tv_tinh_trang_xe);
            tvThanhPho = (TextView) itemView.findViewById(R.id.tv_thanhpho);
        }
    }
}