package FifthHomeWork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UniqWords {

    public static void main(String[] args) {
        Set<String> words = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(
                "Война и мир_книга.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                Pattern pattern = Pattern.compile("[а-яА-Я]+");
                Matcher matcher = pattern.matcher(line);

                while (matcher.find()) {
                    words.add(matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

