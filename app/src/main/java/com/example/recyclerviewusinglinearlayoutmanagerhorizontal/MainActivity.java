package com.example.recyclerviewusinglinearlayoutmanagerhorizontal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.recyclerviewusinglinearlayoutmanagerhorizontal.adapter.Iclick;
import com.example.recyclerviewusinglinearlayoutmanagerhorizontal.adapter.UserAdapter;
import com.example.recyclerviewusinglinearlayoutmanagerhorizontal.model.User;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private RecyclerView recyclerView;
    private UserAdapter userAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcv_user);
        userAdapter = new UserAdapter(getListUser(), new Iclick() {

            @Override
            public void ItemClickUser(User user) {
                OnClickToDetail(user);
            }
        });

        //set giao dien
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);

        userAdapter.SetData(getListUser());

        recyclerView.setAdapter(userAdapter);

    }
    private List<User> getListUser()
    {
        List<User> list =new ArrayList<>();

        list.add(new User(R.drawable.anh1,"Hà anh1"));
        list.add(new User(R.drawable.anh2,"Hà anh2"));
        list.add(new User(R.drawable.anh3,"Hà anh3"));
        list.add(new User(R.drawable.anh4,"Hà anh4"));

        list.add(new User(R.drawable.anh1,"Hà anh5"));
        list.add(new User(R.drawable.anh3,"Hà anh6"));
        list.add(new User(R.drawable.anh2,"Hà anh7"));
        list.add(new User(R.drawable.anh4,"Hà anh8"));

        list.add(new User(R.drawable.anh1,"Hà anh9"));
        list.add(new User(R.drawable.anh4,"Hà anh10"));
        list.add(new User(R.drawable.anh3,"Hà anh11"));
        list.add(new User(R.drawable.anh2,"Hà anh12"));


        list.add(new User(R.drawable.anh4,"Hà anh13"));
        list.add(new User(R.drawable.anh2,"Hà anh14"));
        list.add(new User(R.drawable.anh3,"Hà anh15"));
        list.add(new User(R.drawable.anh1,"Hà anh16"));

        list.add(new User(R.drawable.anh4,"Hà anh17"));
        list.add(new User(R.drawable.anh2,"Hà anh18"));
        list.add(new User(R.drawable.anh3,"Hà anh19"));
        list.add(new User(R.drawable.anh1,"Hà anh20"));


        list.add(new User(R.drawable.anh4,"Hà anh21"));
        list.add(new User(R.drawable.anh2,"Hà anh22"));
        list.add(new User(R.drawable.anh3,"Hà anh23"));
        list.add(new User(R.drawable.anh1,"Hà anh24"));


        list.add(new User(R.drawable.anh4,"Hà anh25"));
        list.add(new User(R.drawable.anh2,"Hà anh26"));
        list.add(new User(R.drawable.anh3,"Hà anh27"));
        list.add(new User(R.drawable.anh1,"Hà anh28"));

        list.add(new User(R.drawable.anh4,"Hà anh29"));
        list.add(new User(R.drawable.anh2,"Hà anh30"));
        list.add(new User(R.drawable.anh3,"Hà anh31"));
        list.add(new User(R.drawable.anh1,"Hà anh32"));

        list.add(new User(R.drawable.anh4,"Hà anh33"));
        list.add(new User(R.drawable.anh2,"Hà anh34"));
        list.add(new User(R.drawable.anh3,"Hà anh35"));
        list.add(new User(R.drawable.anh1,"Hà anh36"));

        list.add(new User(R.drawable.anh4,"Hà anh37"));
        list.add(new User(R.drawable.anh2,"Hà anh38"));
        list.add(new User(R.drawable.anh3,"Hà anh39"));
        list.add(new User(R.drawable.anh1,"Hà anh40"));
        list.add(new User(R.drawable.anh3,"Hà anh41"));
        list.add(new User(R.drawable.anh1,"Hà anh42"));

        return list;
    }
    private void OnClickToDetail(User user)
    {
        Intent intent=new Intent(this, DetailActivity.class);
        Bundle bundle =new Bundle();
        bundle.putSerializable("objectUser",user);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
