package com.example.user.gallows;

/**
 * Created by User on 29.11.2017.
 */

class GallowsModel {
    private String secretWord;
    private String guessedWord;
    private int mistakesCount;


    public GallowsModel() {
        secretWord = "";
        mistakesCount = 0;

    }


    public String getSecretWord() {
        return secretWord;
    }

    public String getGuessedWord() {
        return guessedWord;
    }

    public void setGuessedWord(String guessedWord) {
        this.guessedWord = guessedWord;
    }

    public void setMistakesCount(int mistakesCount) {
        this.mistakesCount = mistakesCount;
    }

    public int getMistakesCount() {
        return mistakesCount;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }
}
