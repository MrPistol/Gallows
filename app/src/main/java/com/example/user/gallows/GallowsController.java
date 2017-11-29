package com.example.user.gallows;

import java.util.Arrays;

/**
 * Created by User on 29.11.2017.
 */

class GallowsController {
    String secretWord;
    String guessedWord;
    char [] guessedWordArray;
    GallowsModel model;
    public GallowsController(GallowsModel model) {
        this.model = model;
        secretWord = model.getSecretWord();
        guessedWord = model.getGuessedWord();
        hideSecretWord(secretWord);
    }

    public void guess(String letter) {

        showLetter(secretWord, letter);
    }

    private void hideSecretWord(String secretWord) {
        char [] guessedWordArray = secretWord.toCharArray();
        Arrays.fill(guessedWordArray, '*'); // v "" string v '' char
    }

    private void showLetter(String secretWord, String letter) {
        char [] secretWordArray = secretWord.toCharArray();
        char letterChar = letter.charAt(0);
        for (int i=0; i < secretWordArray.length; i++){
            if (secretWordArray[i] == letterChar){
                guessedWordArray[i] = letterChar;
            }

        }
    }
}
