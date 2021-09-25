package com.example.baikiemtra.Adapter;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.baikiemtra.R;
import com.example.sinhvien.SinhVienModel;

public class StudentAdapter extends ArrayAdapter<SinhVienModel> {
    Activity activity;
    int resource;
    public StudentAdapter(@NonNull Context context, int resource) {
        super(context, resource);
        this.activity = (Activity) context;
        this.resource = resource;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.activity.getLayoutInflater();
        View spView = layoutInflater.inflate(this.resource, null);
        ImageView img = spView.findViewById(R.id.imgSp);
        TextView txtName = spView.findViewById(R.id.txtSpName);
        TextView txtPrice = spView.findViewById(R.id.txtSpPrice);

        SinhVienModel sinhvien = getItem(position);
        img.setImageResource(1);
        txtName.setText(sinhvien.getTen());
        txtPrice.setText(sinhvien.getMSSV() + "");
        return spView;
    }
}
