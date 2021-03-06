package com.example.user.gallows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    TextView secretWordsTextView;
    TextView mistakesCountTextView;
    EditText guessEditText;
    EditText addWordET;
    Button submitButton;
    Button restartButton;
    Button addWordButton;
    GallowsController controller;
    GallowsModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        secretWordsTextView = findViewById(R.id.secret_word_text_view);
        mistakesCountTextView = findViewById(R.id.mistakes_count_text_view);
        guessEditText = findViewById(R.id.guess_edit_text);
        addWordET = findViewById(R.id.add_word_et);
        submitButton = findViewById(R.id.submit_button);
        restartButton = findViewById(R.id.restart_button);
        addWordButton = findViewById(R.id.add_word_button);
        model = new GallowsModel();
        controller = new GallowsController(model);


        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (guessEditText.getText().toString().length() != 0) {
                    controller.guess(guessEditText.getText().toString());
                    showGuessedWord();
                }

            }
        });

        restartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                newGame();
                showGuessedWord();


            }
        });

        addWordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (addWordET.getText().toString().length() != 0) {


                    controller.add(addWordET.getText().toString());


                }
            }
        });

    }


    private void newGame() {
        model = new GallowsModel();
        controller = new GallowsController(model);
    }

    private void showGuessedWord() {
        mistakesCountTextView.setText(String.valueOf(model.getMistakesCount()));

        secretWordsTextView.setText(model.getGuessedWord());
        guessEditText.setText("");
    }
}
