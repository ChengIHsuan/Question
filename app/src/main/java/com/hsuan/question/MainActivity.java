package com.hsuan.question;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final int FUNC_Q1 = 1;
    public static final int FUNC_Q2 = 2;
    public static final int FUNC_Q3 = 3;
    private ListView question;
    private String[] questions;
    private String a1;
    private String a2;
    private String a3;
    private TextView tvA1;
    private TextView tvA2;
    private TextView tvA3;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case FUNC_Q1:
                if (resultCode == RESULT_OK) {
                    a1 = data.getStringExtra("Answer1");
                    tvA1.setText(tvA1.getText() + " " + a1);
                }
                break;
            case FUNC_Q2:
                if (resultCode == RESULT_OK) {
                    a2 = data.getStringExtra("Answer2");
                    tvA2.setText(tvA2.getText() + " " + a2);
                }
                break;
            case FUNC_Q3:
                if (resultCode == RESULT_OK) {
                    a3 = data.getStringExtra("Answer3");
                    tvA3.setText(tvA3.getText() + " " + a3);
                }
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = (ListView) findViewById(R.id.list);
        questions = new String[]{"Year?", "Last year?", "Next year?"};
        ArrayAdapter adQuestion = new ArrayAdapter(this, android.R.layout.simple_list_item_1, questions);
        question.setAdapter(adQuestion);
        question.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        startActivityForResult(new Intent(MainActivity.this, Q1Activity.class), FUNC_Q1);
                        tvA1 = (TextView) view;
                        break;
                    case 1:
                        startActivityForResult(new Intent(MainActivity.this, Q2Activity.class), FUNC_Q2);
                        tvA2 = (TextView) view;
                        break;
                    case 2:
                        startActivityForResult(new Intent(MainActivity.this, Q3Activity.class), FUNC_Q3);
                        tvA3 = (TextView) view;
                        break;
                }
            }
        });

    }


}
