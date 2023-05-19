package Words;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Words {
    private String[] wordsList = new String[0];


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

        for (int i = 0; i < newWordList.length; i++) {
            if (i == wordsList.length) {
                System.out.println("la palabra \'" + word + "\' se ha guardado correctamente");
                newWordList[i] = word;
                //crear filtro palabras repetidas
                //sanitanizador
            } else {
                newWordList[i] = wordsList[i];
            }
        }
        wordsList = newWordList;

        Arrays.sort(wordsList);
    }

    public void removeWord(String word) {
        for (int i = 0; i < wordsList.length; i++) {
            if (wordsList[i].equals(word)) {
                wordsList[i] = null;
                System.out.println("la palabra \'" + word + "\' ha sido eliminada");
            }
        }
    }

    public void searchWord(String word) {
        for (int i = 0; i < wordsList.length; i++) {
            if (wordsList[i] == null) {
                System.out.println("palabra no encontrada");
            } else if (wordsList[i].equals(word)) {
                System.out.println("se ha encontrado la palabra \'" + word + "\'");
            }
        }
    }

    public void aviableInitialLetter() {
        for (int i = 0; i < wordsList.length; i++) {
            char initialLetter = wordsList[i].toUpperCase(Locale.ROOT).charAt(0);
            System.out.println(initialLetter);;
        }
    }

    public void sameInitialWords(String initial) {
        List<String> words = new ArrayList<String>();
        for (int i = 0; i < wordsList.length; i++) {
            if (initial.equals(wordsList[i].substring(0))) {
                words.add(wordsList[i]);
            }
        }
        System.out.println("las palabras son: ");
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
    }


}

