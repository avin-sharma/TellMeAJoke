package com.avinsharma.jokesjavalibrary;

import java.util.Random;

public class Joker {
    public static String getJoke(){
        Random random = new Random();
        String[] jokes = new String[] {
                "Joke 1",
                "Joke 2",
                "Joke 3",
                "Joke 4",
                "Joke 5",
                "Joke 6",
                "Joke 7",
        };
        return jokes[random.nextInt((jokes.length))];
    }
}