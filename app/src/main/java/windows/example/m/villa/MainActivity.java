package windows.example.m.villa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText nama;
    private EditText ktp;
    private EditText villa;
    private Button pesan;
    private TextView info;
    private TextView nama2;
    private TextView ktp2;
    private TextView villa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nama = findViewById(R.id.nama);
        ktp = findViewById(R.id.ktp);
        villa = findViewById(R.id.villa);
        pesan = findViewById(R.id.pesan);
        info = findViewById(R.id.info);
        nama2 = findViewById(R.id.nama2);
        ktp2 = findViewById(R.id.ktp2);
        villa2 = findViewById(R.id.villa2);

        pesan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nama2.setText("Nama Pemesan : "+nama.getText().toString());
                ktp2.setText("No KTP Pemesan : "+ktp.getText().toString());
                villa2.setText("Villa Yang Ingin Dipesan : "+villa.getText().toString());
            }
        });

    }
}

