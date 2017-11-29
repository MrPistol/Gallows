package com.example.user.gallows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView secretWordsTextView;
    TextView mistakesCountTextView;
    EditText guessEditText;
    Button submitButton;
    GallowsController controller;
    GallowsModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        secretWordsTextView = findViewById(R.id.secret_word_text_view);
        mistakesCountTextView = findViewById(R.id.mistakes_count_text_view);
        guessEditText = findViewById(R.id.guess_edit_text);
        submitButton = findViewById(R.id.submit_button);
        model = new GallowsModel();
        controller = new GallowsController(model);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                controller.guess(guessEditText.getText().toString());
            }
        });
    }
}
