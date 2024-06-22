package oop.analyzer;

//Негативное содержание будем определять по наличию одного из трех смайликов — :( =( :|.

import java.util.regex.Pattern;

public class NegativeTextAnalyzer extends KeywordAnalyzer {


    @Override
    public Label processText(String text) {

        for (String word : getKeywords()) {
            if (text.contains(word)) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeywords() {
        return new String[]{":(", "=(", ":|"};
    }

    @Override
    protected Label getLabel() {
        return Label.NEGATIVE_TEXT;
    }
}
