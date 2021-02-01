package com.maytinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button cong, tru, nhan, chia;
    EditText soA, soB, result;
    int kq = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhXa();
        tinhToan();
    }

    private void anhXa() {
        cong = findViewById(R.id.cong);
        tru = findViewById(R.id.tru);
        nhan = findViewById(R.id.nhan);
        chia = findViewById(R.id.chia);
        soA = findViewById(R.id.edit_numbera);
        soB = findViewById(R.id.edit_numberb);
        result = findViewById(R.id.result);
    }

    private void tinhToan() {

        cong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (soA.getText().toString().equals("") || soB.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Khong hop le", Toast.LENGTH_SHORT).show();
                } else
                    result.setText(Double.parseDouble(soA.getText().toString()) + Double.parseDouble(soB.getText().toString()) + "");
            }
        });
        tru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (soA.getText().toString().equals("") || soB.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Khong hop le", Toast.LENGTH_SHORT).show();
                } else
                    result.setText(Double.parseDouble(soA.getText().toString()) - Double.parseDouble(soB.getText().toString()) + "");
            }
        });
        nhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (soA.getText().toString().equals("") || soB.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Khong hop le", Toast.LENGTH_SHORT).show();
                } else
                    result.setText(Double.parseDouble(soA.getText().toString()) * Double.parseDouble(soB.getText().toString()) + "");
            }
        });
        chia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (soA.getText().toString().equals("") || soB.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Khong hop le", Toast.LENGTH_SHORT).show();
                } else
                    result.setText(Double.parseDouble(soA.getText().toString()) / Double.parseDouble(soB.getText().toString()) + "");
            }
        });

    }
}
