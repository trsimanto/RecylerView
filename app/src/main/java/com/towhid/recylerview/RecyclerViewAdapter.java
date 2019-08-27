package com.towhid.recylerview;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

//contact fragment k control korte abong recycle view  er kj korte creat kora hoese
class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    Context mcontext;
    List<Contact> mData; //contact clalss type array list object declare kora hoese just , instantiate kora hoy nai
    Dialog myDialog;

    public RecyclerViewAdapter(Context mcontext, List<Contact> mData) {
        this.mcontext = mcontext;
        this.mData = mData;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        view=LayoutInflater.from(mcontext).inflate(R.layout.item_contact,parent,false);
        final MyViewHolder viewHolder =new MyViewHolder(view);

        //dialog ini
        myDialog=new Dialog(mcontext);
        myDialog.setContentView(R.layout.dialog_contact);
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        viewHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView dialog_name_tv=(TextView) myDialog.findViewById(R.id.dialog_name_id);
                TextView dialog_phone_tv=(TextView) myDialog.findViewById(R.id.dialog_phone_id);
                ImageView dialog_contact_img=(ImageView) myDialog.findViewById(R.id.dialog_img);
                dialog_name_tv.setText(mData.get(viewHolder.getAdapterPosition()).getName());
                dialog_phone_tv.setText(mData.get(viewHolder.getAdapterPosition()).getPhone());
                dialog_contact_img.setImageResource(mData.get(viewHolder.getAdapterPosition()).getPhoto());

                Toast.makeText(mcontext,"Test Click"+String.valueOf(viewHolder.getAdapterPosition()),Toast.LENGTH_LONG).show();
                myDialog.show();
            }
        });

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.tv_name.setText(mData.get(position).getName());
        holder.tv_phone.setText(mData.get(position).getPhone());
        holder.img.setImageResource(mData.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout item_contact;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;

        public MyViewHolder(View itemView) {

            super(itemView);
            item_contact=(LinearLayout)itemView.findViewById(R.id.item_contact_id);
            tv_name=(TextView) itemView.findViewById(R.id.name_contact);
            tv_phone=(TextView) itemView.findViewById(R.id.phone_contact);
            img=(ImageView) itemView.findViewById(R.id.img_contact);

        }
    }
}
