package com.palarz.mike;

import com.palarz.mike.jokes.JokeSmith;

public class JokeWizard {

    public String getJoke() {
        JokeSmith jokeSmith = new JokeSmith();

        return jokeSmith.getJoke() + "\nIt will make you cry laughing.";
    }

}
