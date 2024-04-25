package zinxus.nghieu.vd2_intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btnchuyen_nl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        btnchuyen_nl = findViewById(R.id.btnchuyen_nl);
        btnchuyen_nl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iNhap = new Intent( MainActivity.this, NhaplieuActivity.class);
                startActivityForResult(iNhap, 8000);
            }
        });
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode,data);
        if(requestCode==8000 && resultCode==RESULT_OK){
                String hovatenNhanduoc = data.getStringExtra("HT");
                int namsinhnhanduoc = data.getIntExtra("NS",2020);

                TextView tvHT =(TextView)findViewById(R.id.tvHoTen);
                TextView tvNS =(TextView)findViewById(R.id.tvNamSinh);
                tvHT.setText(hovatenNhanduoc);
                tvNS.setText(String.valueOf(namsinhnhanduoc));
            }
        else
                Toast.makeText(this,"Trả về thất bại",Toast.LENGTH_LONG).show();
    }


}