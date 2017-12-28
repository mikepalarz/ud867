package com.palarz.mike.jokes.test;

import com.palarz.mike.jokes.JokeSmith;
import org.junit.Test;

public class JokeSmithTest {

	@Test
	public void test() {
		JokeSmith jokeSmith = new JokeSmith();
		assert jokeSmith.getJoke().length() != 0;
	}

}
