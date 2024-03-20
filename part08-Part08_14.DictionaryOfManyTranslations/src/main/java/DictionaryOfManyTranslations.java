import java.util.HashMap;
import java.util.ArrayList;
public class DictionaryOfManyTranslations {
    private HashMap <String, ArrayList<String>> dictionary = new HashMap<>();

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        if (this.dictionary.containsKey(word)) {
            this.dictionary.get(word).add(translation);
        } else {
            ArrayList<String> translations = new ArrayList<>();
            translations.add(translation);
            this.dictionary.put(word, translations);
        }
    }
    public ArrayList<String> translate(String word) {
        if (this.dictionary.containsKey(word)) {
            return this.dictionary.get(word);
        } else {
            return new ArrayList<>();
        }
    }

    public void remove(String word) {
        if(this.dictionary.containsKey(word)) {
            this.dictionary.remove(word);
        }
    }

    }

