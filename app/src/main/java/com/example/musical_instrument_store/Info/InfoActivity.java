package com.example.musical_instrument_store.Info;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.musical_instrument_store.R;

public class InfoActivity extends AppCompatActivity {

    ImageView imageView;
    TextView tvFullname, tvDescription;
    EditText etQty;
    Button btnAddtoCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

        imageView = findViewById(R.id.imageView);
        tvFullname= findViewById(R.id.tvFullname);
        tvDescription= findViewById(R.id.tvDescription);
        etQty= findViewById(R.id.etQty);
        btnAddtoCart= findViewById(R.id.btnAddtoCart);

        Bundle bundle= getIntent().getExtras();

        if(bundle !=null){
            imageView.setImageResource(bundle.getInt("image"));
            tvFullname.setText(bundle.getString("fullname"));
            tvDescription.setText(bundle.getString("description"));
            etQty.setText(bundle.getString("qty"));

            btnAddtoCart.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    addtocart();
                }
            });
        }
    }
    public void addtocart(){

    }
}
