package com.palarz.mike.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.palarz.mike.JokeWizard;
import com.palarz.mike.jokes.JokeSmith;

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
        TextView textView = (TextView) rootView.findViewById(R.id.joke_text_view);
        JokeWizard jokeWizard = new JokeWizard();
        textView.setText(jokeWizard.getJoke());

        return rootView;
    }
}
