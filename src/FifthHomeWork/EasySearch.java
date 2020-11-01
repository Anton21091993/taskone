package FifthHomeWork;

public class EasySearch  implements ISearchEngine {

    @Override
    public long search(String text, String word, boolean isCaseSensitive) {
        int count = 0;
        int index = -1 * word.length();

        if (!isCaseSensitive) {
            text = text.toLowerCase();
            word = word.toLowerCase();
        }

        do {
            if ((index = text.indexOf(word, index + word.length())) >= 0
                    && (index == 0 || !Character.isLetter(text.charAt(index - 1)))
                    && (index + word.length() >= text.length()
                    || !Character.isLetter(text.charAt(index + word.length())))) {
                count++;
            }
        } while (index >= 0);

        return count;
    }
}

