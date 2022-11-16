package com.example.baquiran_tupaz_final_project_quiz;

import static android.content.Intent.ACTION_VIEW;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    private String selectedTopicName= "";

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout rome = findViewById(R.id.romeLayout);
        final LinearLayout greece = findViewById(R.id.greeceLayout);
        final LinearLayout egypt = findViewById(R.id.egyptLayout);
        final LinearLayout china = findViewById(R.id.chinaLayout);

        final Button startBtn = findViewById(R.id.startQuizBtn);

        //if player clicked the roman subject
        rome.setOnClickListener (view -> {
            selectedTopicName = "rome";
            rome.setBackgroundResource(R.drawable.round_back_white_stroke10);
            greece.setBackgroundResource(R.drawable.round_back_white10);
            egypt.setBackgroundResource(R.drawable.round_back_white10);
            china.setBackgroundResource(R.drawable.round_back_white10);
        });

        //if player clicked the greek subject
        greece.setOnClickListener (view -> {
            selectedTopicName = "greece";
            greece.setBackgroundResource(R.drawable.round_back_white_stroke10);
            rome.setBackgroundResource(R.drawable.round_back_white10);
            egypt.setBackgroundResource(R.drawable.round_back_white10);
            china.setBackgroundResource(R.drawable.round_back_white10);
        });

        //if player clicked the egyptian subject
        egypt.setOnClickListener (view -> {
            selectedTopicName = "egypt";
            egypt.setBackgroundResource(R.drawable.round_back_white_stroke10);
            rome.setBackgroundResource(R.drawable.round_back_white10);
            greece.setBackgroundResource(R.drawable.round_back_white10);
            china.setBackgroundResource(R.drawable.round_back_white10);
        });

        //if player clicked the chinese subject
        china.setOnClickListener (view -> {
            selectedTopicName = "china";
            china.setBackgroundResource(R.drawable.round_back_white_stroke10);
            rome.setBackgroundResource(R.drawable.round_back_white10);
            greece.setBackgroundResource(R.drawable.round_back_white10);
            egypt.setBackgroundResource(R.drawable.round_back_white10);
        });

        startBtn.setOnClickListener(view -> {
            if(selectedTopicName.isEmpty())
            {
                Toast.makeText(MainActivity.this,"Please select a topic!",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                intent.putExtra("selectedTopic", selectedTopicName);
                startActivity(intent);
            }
        });
    }
}