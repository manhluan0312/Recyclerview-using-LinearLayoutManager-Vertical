package com.example.recyclerviewusinglinearlayoutmanagerhorizontal.adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewusinglinearlayoutmanagerhorizontal.DetailActivity;
import com.example.recyclerviewusinglinearlayoutmanagerhorizontal.R;
import com.example.recyclerviewusinglinearlayoutmanagerhorizontal.model.User;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder>
{
    private List<User> userList;
    private Iclick iclick;


    public UserAdapter(List<User> userList,Iclick iclick) {
        this.userList = userList;
        this.iclick=iclick;

    }

    public UserAdapter() {
        ;
    }

    public void SetData(List<User> list)
    {
        this.userList=list;
        notifyDataSetChanged();
    }



    @Override
    public UserViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapter.UserViewHolder holder, int position)
    {
        User user =userList.get(position);
        if(user==null){
            return;
        }
        holder.img.setImageResource(user.getRe_image());
        holder.tv_ten.setText(user.getName());

        holder.layoutItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              iclick.ItemClickUser(user);
            }
        });
    }


    @Override
    public int getItemCount() {
        if(userList!=null)
        {
            return userList.size();
        }
        return 0;
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {

        private RelativeLayout layoutItem;
        private ImageView img;
        private TextView tv_ten;

        public UserViewHolder(View itemView) {

            super(itemView);
            layoutItem=itemView.findViewById(R.id.layoutItem);
            img = itemView.findViewById(R.id.img_user);
            tv_ten = itemView.findViewById(R.id.tv_name);
        }
    }
}