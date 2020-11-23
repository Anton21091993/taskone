package SixthHomeWork;

import FifthHomeWork.ISearchEngine;

public class SearchTask {

    private ISearchEngine searchEngine;
    private String text;
    private String word;

    public SearchTask(ISearchEngine searchEngine, String text, String word) {
        this.searchEngine = searchEngine;
        this.text = text;
        this.word = word;


    }

}

