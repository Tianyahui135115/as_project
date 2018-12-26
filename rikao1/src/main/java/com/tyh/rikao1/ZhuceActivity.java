package com.tyh.rikao1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ZhuceActivity extends AppCompatActivity {
    private EditText shoujihao;
    private EditText mima;
    private Button zhuceliji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zhuce);
        shoujihao = findViewById(R.id.mZhuCesj);
        mima = findViewById(R.id.mZhuceMima);
        zhuceliji = findViewById(R.id.mzhuceLiji);
    }
}
