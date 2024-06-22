package oop.analyzer;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    @Override
    public Label processText(String text) {
        for (String keyword : getKeywords()) {
            if (text.toLowerCase().contains(keyword) && !keyword.isEmpty()) {
                return getLabel();
            }
        }
        return Label.OK;
    }


    protected abstract Label getLabel();
}
