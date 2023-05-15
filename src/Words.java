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
        this.wordsList[wordsList.length] = word;
    }

    public void removeWord(String word) {
        for (int i = 0; i < wordsList.length; i++) {
            if (wordsList[i].equals("word")) {
                wordsList[i] = null;
            }
        }
    }
}

