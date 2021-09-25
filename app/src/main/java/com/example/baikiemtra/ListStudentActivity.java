package com.example.baikiemtra;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.sinhvien.SinhVienModel;
import com.nostra13.universalimageloader.cache.memory.impl.WeakMemoryCache;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ListStudentActivity extends AppCompatActivity {
    ArrayAdapter<SinhVienModel> sinhVienModelArrayAdapter;
    ListView lsvStudent1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SetupLoadImage();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_student);
        lsvStudent1 = findViewById(R.id.lsvStudent);
        String pathImage = "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F844495367623777895%2F&psig=AOvVaw0gNckvUgBO7Qms84ZChmYl&ust=1632640341966000&source=images&cd=vfe&ved=0CAsQjRxqFwoTCLDgk7DJmfMCFQAAAAAdAAAAABAD";
        try {
            sinhVienModelArrayAdapter = new ArrayAdapter<>(ListStudentActivity.this, android.R.layout.simple_list_item_1);
            sinhVienModelArrayAdapter.add(new SinhVienModel("1811060025", "Cao Tiến Hào", "0902209902",ConvertDateFromString("2021/08/08") ,ConvertDateFromString("2022/08/08"),"16","Đơn vị",pathImage));
            sinhVienModelArrayAdapter.add(new SinhVienModel("1811060026", "Đặng Anh Khoa", "0952738940",ConvertDateFromString("2021/08/08") ,ConvertDateFromString("2022/08/08"),"17","Đơn vị",pathImage));
            sinhVienModelArrayAdapter.add(new SinhVienModel("1811060027", "Trần Trung Trực", "0921547289",ConvertDateFromString("2021/08/08") ,ConvertDateFromString("2022/08/08"),"18","Đơn vị",pathImage));
            sinhVienModelArrayAdapter.add(new SinhVienModel("1811060028", "Phan Thị Trang", "0975125678",ConvertDateFromString("2021/08/08") ,ConvertDateFromString("2022/08/08"),"19","Đơn vị",pathImage));
            sinhVienModelArrayAdapter.add(new SinhVienModel("1811060029", "Nguyễn Văn Tèo", "0948502258",ConvertDateFromString("2021/08/08") ,ConvertDateFromString("2022/08/08"),"20","Đơn vị",pathImage));
            sinhVienModelArrayAdapter.add(new SinhVienModel("1811060030", "Nguyễn Thị Xuân", "0948502258",ConvertDateFromString("2021/08/08") ,ConvertDateFromString("2022/08/08"),"21","Đơn vị",pathImage));
            sinhVienModelArrayAdapter.add(new SinhVienModel("1811060031", "Nguyễn Quyết Tiến", "0948502258",ConvertDateFromString("2021/08/08") ,ConvertDateFromString("2022/08/08"),"22","Đơn vị",pathImage));
            sinhVienModelArrayAdapter.add(new SinhVienModel("1811060032", "Nguyễn Quốc Huy", "0948502258",ConvertDateFromString("2021/08/08") ,ConvertDateFromString("2022/08/08"),"23","Đơn vị",pathImage));
            lsvStudent1.setAdapter(sinhVienModelArrayAdapter);
        } catch (ParseException e) {
            e.printStackTrace();
        }



    }
    private ArrayAdapter<SinhVienModel> InitListStudent() throws ParseException {

        return  sinhVienModelArrayAdapter;
    }
    private Date ConvertDateFromString(String Date) throws ParseException {
        return new SimpleDateFormat("yyyy/MM/dd").parse(Date);
    }
    private void SetupLoadImage(){
        // UNIVERSAL IMAGE LOADER SETUP
        DisplayImageOptions defaultOptions = new DisplayImageOptions.Builder()
                .cacheOnDisc(true).cacheInMemory(true)
                .imageScaleType(ImageScaleType.EXACTLY)
                .displayer(new FadeInBitmapDisplayer(300)).build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(
                getApplicationContext())
                .defaultDisplayImageOptions(defaultOptions)
                .memoryCache(new WeakMemoryCache())
                .discCacheSize(100 * 1024 * 1024).build();

        ImageLoader.getInstance().init(config);
        // END - UNIVERSAL IMAGE LOADER SETUP
    }
}