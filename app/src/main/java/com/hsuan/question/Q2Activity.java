package com.hsuan.question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q2Activity extends AppCompatActivity {

    private EditText edA2;
    private String a2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        edA2 = (EditText) findViewById(R.id.ed_a2);
        a2 = edA2.getText().toString();
    }
    public void OK(View view) {
        getIntent().putExtra("Answer2", a2);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}
