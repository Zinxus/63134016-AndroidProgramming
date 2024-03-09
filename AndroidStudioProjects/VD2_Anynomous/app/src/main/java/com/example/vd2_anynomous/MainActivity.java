package com.example.vd2_anynomous;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    //Khai bao cac đối tượng gần cới đkhiển tương ứng ở đây
    EditText editTextsoA;
    EditText editTextsoB;
    EditText editTextKQ;
    Button nutCong,nutTru,nutNhan,nutChia;
    public void Timdieukhien() {
        editTextsoA = (EditText) findViewById(R.id.edtso1);
        editTextsoB = (EditText) findViewById(R.id.edtso2);
        editTextKQ = findViewById(R.id.edtKQ);
        nutCong = (Button) findViewById(R.id.btnCong);
        nutTru = (Button) findViewById(R.id.btnTru);
        nutNhan = (Button) findViewById(R.id.btnNhan);
        nutChia = (Button) findViewById(R.id.btnChia);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Timdieukhien();
        //Gắn bộ lắng nghe sự kiện và code xử lý cho từng nút
        View.OnClickListener boLangNgheCong = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gọi hàm Xử lý Cộng ở đây
                XulyCong();
            }
        };
        nutCong.setOnClickListener(boLangNgheCong);
        nutTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gọi hàm Xử lý trừ ở đây
                XulyTru();
            }
        });
        nutNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gọi hàm Xử lý nhân ở đây
                XulyNhan();
            }
        });
        nutChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Gọi hàm Xử lý chia ở đây
                XulyChia();
            }
        });
    }

    public void XulyCong(){

        //Lay du lieu ve o dieu khien ve a
        String strsoA = editTextsoA.getText().toString();
        //Lay du lieu ve o dieu khien ve b
        String strsoB =editTextsoB.getText().toString();
        //Chuyen du lieu sang dang so
        float so_a = Float.parseFloat(strsoA);
        float so_b = Float.parseFloat(strsoB);
        //Tinh toan theo yeu cau
        float Tong  = so_a + so_b;
        String strTong = String.valueOf(Tong);
        //Hien thi ra man hinh
        editTextKQ.setText(strTong);
    }
    public void XulyTru(){

        //Lay du lieu ve o dieu khien ve a
        String strsoA = editTextsoA.getText().toString();
        //Lay du lieu ve o dieu khien ve b
        String strsoB =editTextsoB.getText().toString();
        //Chuyen du lieu sang dang so
        float so_a = Float.parseFloat(strsoA);
        float so_b = Float.parseFloat(strsoB);
        //Tinh toan theo yeu cau
        float Tong  = so_a - so_b;
        String strTong = String.valueOf(Tong);
        //Hien thi ra man hinh
        editTextKQ.setText(strTong);
    }
    public void XulyNhan(){

        //Lay du lieu ve o dieu khien ve a
        String strsoA = editTextsoA.getText().toString();
        //Lay du lieu ve o dieu khien ve b
        String strsoB =editTextsoB.getText().toString();
        //Chuyen du lieu sang dang so
        float so_a = Float.parseFloat(strsoA);
        float so_b = Float.parseFloat(strsoB);
        //Tinh toan theo yeu cau
        float Tong  = so_a * so_b;
        String strTong = String.valueOf(Tong);
        //Hien thi ra man hinh
        editTextKQ.setText(strTong);
    }
    public void XulyChia(){

        //Lay du lieu ve o dieu khien ve a
        String strsoA = editTextsoA.getText().toString();
        //Lay du lieu ve o dieu khien ve b
        String strsoB =editTextsoB.getText().toString();
        //Chuyen du lieu sang dang so
        float so_a = Float.parseFloat(strsoA);
        float so_b = Float.parseFloat(strsoB);
        //Tinh toan theo yeu cau
        float Tong  = so_a / so_b;
        String strTong = String.valueOf(Tong);
        //Hien thi ra man hinh
        editTextKQ.setText(strTong);
    }
}