package com.example.modul2_kel30;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AboutActivity extends AppCompatActivity {

    ListView kelompok;
    String kel30[]
            = { "Fitri Mardiana - 21120119130112", "Abdullah Azzam Farid M. - 21120119130071",
            "M. Anandito Rafiansyah - 21120119130082", "Saipul Anwar - 21120119120034" };

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        kelompok = findViewById(R.id.list);
        ArrayAdapter<String> arr;
        arr
                = new ArrayAdapter<String>(
                this,
                R.layout.support_simple_spinner_dropdown_item,
                kel30);
        kelompok.setAdapter(arr);
    }
}