package com.palarz.mike.myapplication;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.palarz.mike.jokes.JokeSmith;
import com.palarz.mike.mylibrary.JokeActivity;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        Button button = (Button) rootView.findViewById(R.id.fragment_main_button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                JokeSmith jokeSmith = new JokeSmith();
                Intent jokeIntent = new Intent(getContext(), JokeActivity.class);
                jokeIntent.putExtra(JokeActivity.EXTRA_KEY_JOKE, jokeSmith.getJoke());
                startActivity(jokeIntent);
            }
        });

        return rootView;
    }
}
