package zinxus.nghieu.vd_intents;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SubActivity1 extends AppCompatActivity {
    Button btnSub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sub1);
        btnSub = findViewById(R.id.btnsub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iManHinhChinh = new Intent(SubActivity1.this, MainActivity.class);
                startActivity(iManHinhChinh);
            }
        });
    }
}