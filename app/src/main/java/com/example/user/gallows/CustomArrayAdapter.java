package com.example.user.gallows;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 01.12.2017.
 */

class CustomArrayAdapter extends ArrayAdapter<MyMessage> {


    public CustomArrayAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MyMessage> messages) {
        super(context, resource, messages);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View listItemView, @NonNull ViewGroup parent) {
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view_item, parent, false);
        }
        final MyMessage currentMessage = getItem(position);
        TextView authorTextView = listItemView.findViewById(R.id.author_text_view);
        TextView messageTextView = listItemView.findViewById(R.id.message_text_view);
        authorTextView.setText(currentMessage.getAuthor());
        messageTextView.setText(currentMessage.getText());
        final TextView likeTextView = listItemView.findViewById(R.id.like_text_view);
        Button likeButton = listItemView.findViewById(R.id.like_button);
        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int likes = currentMessage.getLikes();
                likes++;
                currentMessage.setLikes(likes);
                likeTextView.setText(String.valueOf(currentMessage.getLikes()));
            }
        });

        return listItemView;
    }
}
