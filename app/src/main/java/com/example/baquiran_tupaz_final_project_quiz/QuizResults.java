package com.example.baquiran_tupaz_final_project_quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class QuizResults extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_results);

        final AppCompatButton startNewBtn = findViewById(R.id.startNewQuizBtn);
        final TextView correctAnswers = findViewById(R.id.correctAnswers);
        final TextView incorrectAnswers = findViewById(R.id.incorrectAnswers);

        final String correctsTemp;
        final String incorrectsTemp;

        final int getCorrectAnswers = getIntent().getIntExtra("correct", 0);
        final int getIncorrectAnswers = getIntent().getIntExtra("incorrect", 0);

        correctsTemp = String.valueOf(getCorrectAnswers);
        incorrectsTemp = String.valueOf(getIncorrectAnswers);

        correctAnswers.setText("Correct Answers: "+ correctsTemp);
        incorrectAnswers.setText("Incorrect Answers: "+ incorrectsTemp);

        startNewBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(QuizResults.this, MainActivity.class));
                finish();
            }
        });
    }

    public void onBackPressed()
    {
        startActivity(new Intent(QuizResults.this, MainActivity.class));
        finish();
    }
}