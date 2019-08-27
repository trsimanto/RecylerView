package com.towhid.recylerview;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class FragmentContact extends Fragment {
    View view;
    private RecyclerView myrecyclerView;
    private List<Contact> lstContact;
    public FragmentContact() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.contact_fragment,container,false);

        //////////////////////////////////////////////
        //extra join for recyclerview
        myrecyclerView =(RecyclerView)view.findViewById(R.id.contact_recyclerview); //contact_fragment er xml er akta id j khane view show korbe

        //object create for RecyclerViewAdapter class jeta recycle view ta k control korbe
        RecyclerViewAdapter  recyclerViewAdapter =new RecyclerViewAdapter(getContext(),lstContact);
        myrecyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView.setAdapter(recyclerViewAdapter);
        ////////////////////////////////////////////////

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        lstContact=new ArrayList<>();
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));
        lstContact.add(new Contact("GK Emon","01234567890",R.drawable.gk));



    }
}
