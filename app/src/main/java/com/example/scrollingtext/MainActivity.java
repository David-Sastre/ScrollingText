package com.example.scrollingtext;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int count = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Add_Comment(View view) {
        Button but = findViewById(R.id.new_comment);
        EditText e = (EditText) findViewById(R.id.article_comment);
        TextView txt = (TextView) findViewById(R.id.article);
        but.setText("Send");
        e.setVisibility(view.VISIBLE);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (but.getText() == "Send"){
                   String oldText = txt.getText().toString();
                   String comment = e.getText().toString();
                   count ++;
                   txt.setText(oldText + "\n" + "\n" +"Comment_" +count+" : "+ comment + "\n");
                   but.setText("Add Comment");
                   e.setVisibility(view.INVISIBLE);
               } else {
                    e.setVisibility(View.VISIBLE);
                    but.setText("Send");
                }
            }
        });
    }
}
