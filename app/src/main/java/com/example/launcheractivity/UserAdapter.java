package com.example.launcheractivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {
    List<UserModel> userList;
    Context context;

    public UserAdapter(List<UserModel> userList, Context context) {
        this.userList = userList;
        this.context = context;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.row_item, parent, false);
        UserViewHolder newHolder = new UserViewHolder(view);
        return newHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        UserModel user = userList.get(position);
        holder.firstname.setText(user.getFirstname());
        holder.lastname.setText(user.getLastname());
        holder.age.setText(user.getAge());
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public class UserViewHolder extends RecyclerView.ViewHolder {
        TextView firstname, lastname, age;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            firstname = itemView.findViewById(R.id.tvfirstname);
            lastname = itemView.findViewById(R.id.tvlastname);
            age = itemView.findViewById(R.id.tvage);
        }
    }
}
