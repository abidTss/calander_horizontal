package com.example.abid.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder>{

    private Context context;
    private List<UserModel> userModels;
    private LayoutInflater inflater;

    public RecyclerAdapter(Context context, List<UserModel> userModels) {
        this.context = context;
        this.userModels = userModels;
        inflater=LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=inflater.inflate(R.layout.list_item_view,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        UserModel userModel=userModels.get(i);
        myViewHolder.tvName.setText(userModel.getName());
        myViewHolder.tvLocation.setText(userModel.getLocation());
        myViewHolder.tvAge.setText(userModel.getAge()+" Yrs");
        Glide.with(context).load(userModel.getUrl()).into(myViewHolder.imageView);

    }

    @Override
    public int getItemCount() {
        return userModels.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView tvName,tvAge,tvLocation;
        private ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imgProfile);
            tvAge=itemView.findViewById(R.id.tvAge);
            tvLocation=itemView.findViewById(R.id.tvLocation);
            tvName=itemView.findViewById(R.id.tvName);
        }
    }
}
