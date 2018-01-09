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

    public static final int FUNC_QA = 1;
    private ListView question;
    private String[] questions;
    private String a1;
    private String a2;
    private String a3;

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == FUNC_QA){
            if(resultCode == RESULT_OK){
                a1 = data.getStringExtra("Answer1");
                a2 = data.getStringExtra("Answer2");
                a3 = data.getStringExtra("Answer3");
                Toast.makeText(this, ""+a1, Toast.LENGTH_SHORT);
            }else{

            }
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
                switch (i){
                    case 0:
                        startActivityForResult(new Intent(MainActivity.this, Q1Activity.class), FUNC_QA);
                        break;
                    case 1:
                        startActivityForResult(new Intent(MainActivity.this, Q2Activity.class), FUNC_QA);
                        break;
                    case 2:
                        startActivityForResult(new Intent(MainActivity.this, Q3Activity.class), FUNC_QA);
                        break;
                }
            }
        });

    }


}
