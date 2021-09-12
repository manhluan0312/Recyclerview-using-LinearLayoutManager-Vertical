package com.example.recyclerviewusinglinearlayoutmanagerhorizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerviewusinglinearlayoutmanagerhorizontal.model.User;

public class DetailActivity extends AppCompatActivity {

    TextView tv_name;
    ImageView imageView_name;
    Toolbar toolbar;
    User user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView_name=findViewById(R.id.img_user_detail);
        tv_name=findViewById(R.id.tv_name_detail);
        toolbar=findViewById(R.id.toobar);

        NhanDuLieuTuMainActivity();
        setTooBar();

        tv_name.setText(user.getName());
        imageView_name.setImageResource(user.getRe_image());



    }

    private void NhanDuLieuTuMainActivity()
    {
        Bundle bundle =getIntent().getExtras();
        if(bundle==null){
            return;
        }
        user= (User) bundle.get("objectUser");
    }


    private void setTooBar()
    {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Thông tin chi tiết người dùng ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setSubtitle(user.getName());//sau khi nhan du lieu tu bundle  moi set dc
    }
}