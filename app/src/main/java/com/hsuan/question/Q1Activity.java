package com.hsuan.question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q1Activity extends AppCompatActivity {

    private EditText edA1;
    private String a1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
    }

    public void OK(View view) {
        edA1 = (EditText) findViewById(R.id.ed_a1);
        a1 = edA1.getText().toString();
        getIntent().putExtra("Answer1", a1);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}
