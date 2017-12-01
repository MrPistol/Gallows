package com.example.user.gallows;

import java.util.Arrays;

/**
 * Created by User on 29.11.2017.
 */

class GallowsController {
    String secretWord;
    char [] guessedWordArray;
    GallowsModel model;
    int mistakesCount;
    public GallowsController(GallowsModel model) {
        this.model = model;
        secretWord = model.getSecretWord();
        model.setGuessedWord(hideSecretWord(secretWord));
        guessedWordArray = model.getGuessedWord().toCharArray();
        mistakesCount = model.getMistakesCount();

    }

    public void guess(String letter) {

        showLetter(secretWord, letter);

    }


    public void add(String word) {

        model.setSecretWord(word);

    }



    private String hideSecretWord(String secretWord) {
        char [] guessedWordArray = secretWord.toCharArray();
        Arrays.fill(guessedWordArray, '*'); // v "" string v '' char
        return new String(guessedWordArray);
    }


    private void showLetter(String secretWord, String letter) {
        char[] secretWordArray = secretWord.toCharArray();
        char letterChar = letter.charAt(0);
        int mistake = 1;
        for (int i = 0; i < secretWordArray.length; i++) {
            if (secretWordArray[i] == letterChar) {
                guessedWordArray[i] = letterChar;
                mistake = 0;
            }

        }
        model.setMistakesCount(model.getMistakesCount() + mistake);
        model.setGuessedWord(new String(guessedWordArray));
    }


}
