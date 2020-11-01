package FifthHomeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FrequencyClass {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();

        try (BufferedReader reader = new BufferedReader(new FileReader(
                "Война и мир_книга.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                stringBuffer.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("EasySearch:");
        print(stringBuffer.toString(), "война", new EasySearch(), false);
        print(stringBuffer.toString(), "и", new EasySearch(), false);
        print(stringBuffer.toString(), "мир", new EasySearch(), false);


    }


    private static void print(String text, String word,
                              ISearchEngine searchEngine, boolean isCaseSensitive) {
        System.out.println("Слово \u00AB" + word + "\u00BB встречается в тексте "
                + ISearchEngine.search(text, word, isCaseSensitive) + " раз(а)");
    }
}
