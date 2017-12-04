package com.example.user.gallows;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView mainListView;
    EditText nameEditText;
    EditText messageEditText;
    Button sendButton;
    ArrayList<MyMessage> messageArrayList;
    CustomArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainListView = findViewById(R.id.main_list_view);
        nameEditText = findViewById(R.id.name_edit_text);
        messageEditText = findViewById(R.id.message_edite_text);
        sendButton = findViewById(R.id.send_button);
        messageArrayList = new ArrayList<>();

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (messageEditText.getText().toString().length() != 0
                        && nameEditText.getText().toString().length() != 0) {
                    String text = messageEditText.getText().toString();
                    String author = nameEditText.getText().toString();
                    MyMessage message = new MyMessage(text, author);
                    messageArrayList.add(message);
                    adapter.notifyDataSetChanged();
                }
            }
        });


        adapter = new CustomArrayAdapter(MainActivity.this,
                R.layout.list_view_item, messageArrayList);
        mainListView.setAdapter(adapter);


    }
}
