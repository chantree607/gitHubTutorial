package com.example.bradreelee.instaclone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button profileBtn;
    Button idBtn;
    Button commentBtn;
    Button shareBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profileBtn = (Button) findViewById(R.id.profile_btn);
        idBtn = (Button) findViewById(R.id.id_btn);
        commentBtn = (Button) findViewById(R.id.comment_btn);
        shareBtn = (Button) findViewById(R.id.share_btn);


        profileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        idBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "clicked userID", Toast.LENGTH_LONG).show();
            }
        });

        commentBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "this is a comment function", Toast.LENGTH_LONG).show();
            }
        });

        shareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "this is a share function", Toast.LENGTH_LONG).show();
            }
        });
    }

}
