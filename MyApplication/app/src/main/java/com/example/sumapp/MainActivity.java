 package com.example.sumapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void xulyCong(View view){
        //Tim  , tham chieu den dieu khien tren tep xml
        EditText editTextsoA = findViewById(R.id.edtA);
        EditText editTextsoB = findViewById(R.id.edtb);
        EditText editTextKQ = findViewById(R.id.edtKQ);
        //Lay du lieu ve o dieu khien ve a
        String strsoA = editTextsoA.getText().toString();
        //Lay du lieu ve o dieu khien ve b
        String strsoB =editTextsoB.getText().toString();
        //Chuyen du lieu sang dang so
        int so_a = Integer.parseInt(strsoA);
        int so_b = Integer.parseInt(strsoB);
        //Tinh toan theo yeu cau
        int Tong  = so_a + so_b;
        String strTong = String.valueOf(Tong);
        //Hien thi ra man hinh
        editTextKQ.setText(strTong);
    }
}