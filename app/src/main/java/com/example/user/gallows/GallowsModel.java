package com.example.user.gallows;

/**
 * Created by User on 29.11.2017.
 */

class GallowsModel {
    private String secretWord;
    private String guessedWord;



    public GallowsModel() {
        secretWord = "apple";
    }


    public String getSecretWord() {
        return secretWord;
    }

    public String getGuessedWord() {
        return guessedWord;
    }
}
