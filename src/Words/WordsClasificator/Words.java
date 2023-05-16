package Words.WordsClasificator;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Words {
    private String[] wordsList;

    public Words(String[] wordsList) {
        this.wordsList = wordsList;
    }

    public String[] getWordsList() {
        return wordsList;
    }

    public void setWordsList(String[] palabras) {
        this.wordsList = palabras;
    }

    public void addWord(String word) {
        String[] newWordList = new String[wordsList.length + 1];
        for (int i = 0; i < wordsList.length +1; i++) {

            if (i == wordsList.length) {
                newWordList[i] = word;
            } else {
                newWordList[i] = wordsList[i];
            }
        }
    }

    public void removeWord(String word) {
        for (int i = 0; i < wordsList.length; i++) {
            if (wordsList[i].equals(word)) {
                wordsList[i] = null;
            }
        }
    }

    public void searchWord(String word) {
        for (int i = 0; i < wordsList.length; i++) {
            if (wordsList[i].equals(word)) {
                System.out.println(word);
            }
        }
    }

    public void aviableInitialLetter(String word) {
        for (int i = 0; i < wordsList.length; i++) {
            char initialLetter = wordsList[i].toUpperCase(Locale.ROOT).charAt(0);
            System.out.println(initialLetter);;
        }
    }

    public void sameInitialWords(char initial) {
        List<String> words = new ArrayList<String>();
        for (int i = 0; i < wordsList.length; i++) {
            if (initial == wordsList[i].charAt(0)) {
                words.add(wordsList[i]);
            }
        }
    }


}

