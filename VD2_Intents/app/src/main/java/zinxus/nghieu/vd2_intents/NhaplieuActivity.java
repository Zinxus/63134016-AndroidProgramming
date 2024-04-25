package zinxus.nghieu.vd2_intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class NhaplieuActivity extends AppCompatActivity {
    EditText edHT, edNS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_nhaplieu);
        Button btnchuyen_chinh = findViewById(R.id.btnchuyen_chinh);
        btnchuyen_chinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy dữ liệu từ EditTexts
                edHT = findViewById(R.id.edTHovaTen);
                edNS = findViewById(R.id.edTNamSinh);
                String hoten = edHT.getText().toString();
                int namsinh = Integer.parseInt(edNS.getText().toString());

                // Tạo Intent để trả lại dữ liệu
                Intent iKQNhaplieu = new Intent();
                iKQNhaplieu.putExtra("HT", hoten);
                iKQNhaplieu.putExtra("NS", namsinh);

                // Đặt kết quả là RESULT_OK và gửi dữ liệu về
                setResult(RESULT_OK, iKQNhaplieu);

                // Kết thúc Activity và quay trở lại MainActivity
                finish();
            }
        });
    }

}