package com.example.musical_instrument_store.ui.cart;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musical_instrument_store.Class.Contact;
import com.example.musical_instrument_store.R;
import com.example.musical_instrument_store.adapter.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CartFragment extends Fragment {

    private RecyclerView recyclerView;
    public CartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_cart, container, false);
        recyclerView = view.findViewById(R.id.recycleView);

        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Acoustic Guitar", "vdechgwsvdc", 3000,5, R.drawable.acousticguitar));
        contactList.add(new Contact("Electric Guitar", "dcsddscfc", 5000,2, R.drawable.electricguitar));
        contactList.add(new Contact("Acoustic Drumset", "dsfcdsfcfd", 13000,1, R.drawable.acousticdrumset));
        contactList.add(new Contact("Electronic Drumset", "rtgrgtrgb", 15000,2, R.drawable.electronicdrumset));
        contactList.add(new Contact("Electronic Piano", "hbredcc", 7000,1, R.drawable.electronicpiano));

        ContactsAdapter contactsAdapter = new ContactsAdapter(this, contactList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        return view;
    }

}
