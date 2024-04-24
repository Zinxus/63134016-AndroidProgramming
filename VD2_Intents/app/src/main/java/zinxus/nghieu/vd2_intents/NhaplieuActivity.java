package zinxus.nghieu.vd2_intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NhaplieuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nhaplieu);
    }
    public void ManHinhChinh(View v){
        Intent iManHinhChinh = new Intent( this, MainActivity.class);
        startActivity(iManHinhChinh);
    }
    public void Nhap_Quayve(View v){
        EditText edHT = (EditText) findViewById(R.id.edTHovaTen);
        EditText edNS = (EditText) findViewById(R.id.edTNamSinh);
        String hoten = edHT.getText().toString();
        int namsinh = Integer.parseInt(edNS.getText().toString());
        Intent iKQNhaplieu = new Intent();
        iKQNhaplieu.putExtra("HT", hoten);
        iKQNhaplieu.putExtra("NS", namsinh);
        setResult(RESULT_OK,iKQNhaplieu);
        finish();
    }
}