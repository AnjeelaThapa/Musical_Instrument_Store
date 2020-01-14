package com.example.musical_instrument_store.category;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musical_instrument_store.Class.Contact;
import com.example.musical_instrument_store.R;
import com.example.musical_instrument_store.adapter.ContactsAdapter;

import java.util.ArrayList;
import java.util.List;

public class GuitarActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guitar);

        recyclerView = findViewById(R.id.recycleView);

        //create list of contacts to display in recycleView
        List<Contact> contactList = new ArrayList<>();
        contactList.add(new Contact("Acoustic Guitar", "vdechgwsvdc", 3000,5, R.drawable.acousticguitar));
        contactList.add(new Contact("Electric Guitar", "dcsddscfc", 5000,2, R.drawable.electricguitar));
        contactList.add(new Contact("Acoustic Drumset", "dsfcdsfcfd", 13000,1, R.drawable.acousticdrumset));
        contactList.add(new Contact("Electronic Drumset", "rtgrgtrgb", 15000,2, R.drawable.electronicdrumset));
        contactList.add(new Contact("Electronic Piano", "hbredcc", 7000,1, R.drawable.electronicpiano));


        ContactsAdapter contactsAdapter= new ContactsAdapter(this,contactList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
