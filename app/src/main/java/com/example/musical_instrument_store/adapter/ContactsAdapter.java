package com.example.musical_instrument_store.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.musical_instrument_store.Class.Contact;
import com.example.musical_instrument_store.Info.InfoActivity;
import com.example.musical_instrument_store.R;

import java.util.List;

public class ContactsAdapter extends RecyclerView.Adapter<ContactsAdapter.ContactViewHolder> {

    Context mcontext;
    List<Contact> contactsList;

    public ContactsAdapter(Context mcontext, List<Contact> contactsList){
        this.mcontext= mcontext;
        this.contactsList= contactsList;
    }

    @NonNull
    @Override
    public ContactsAdapter.ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_contacts,parent,false);
        return new ContactViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactsAdapter.ContactViewHolder holder, int position) {

        final Contact contact= contactsList.get(position);
        holder.imgPic.setImageResource(contact.getImageId());
        holder.tvFullname.setText(contact.getFullname());
        holder.tvDecription.setText(contact.getDescription());
        holder.tvPrice.setText(contact.getPrice()+"");


        holder.imgPic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mcontext, InfoActivity.class);

                intent.putExtra("image", contact.getImageId());
                intent.putExtra("fullname",contact.getFullname());
                intent.putExtra("description",contact.getDescription());
                String p = String.valueOf(contact.getPrice());
                intent.putExtra("price",p);

                mcontext.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return contactsList.size();
    }

    public class ContactViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPic;
        TextView tvFullname, tvDecription, tvPrice;
        public ContactViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPic= itemView.findViewById(R.id.imgPic);
            tvFullname= itemView.findViewById(R.id.tvFullname);
            tvDecription= itemView.findViewById(R.id.tvDescription);
            tvPrice= itemView.findViewById(R.id.tvPrice);
        }
    }
}
