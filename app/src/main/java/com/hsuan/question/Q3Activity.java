package com.hsuan.question;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Q3Activity extends AppCompatActivity {

    private EditText edA3;
    private String a3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        edA3 = (EditText) findViewById(R.id.ed_a3);
        a3 = edA3.getText().toString();
    }
    public void OK(View view) {
        getIntent().putExtra("Answer3", a3);
        setResult(RESULT_OK, getIntent());
        finish();
    }
}
