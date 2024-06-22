package oop.analyzer;

// Спам будем фильтровать по наличию указанных ключевых слов в тексте.

public class SpamAnalyzer extends KeywordAnalyzer {
    private String[] keywords;

    public SpamAnalyzer(String[] keywords) {
        this.keywords = keywords;
    }


    @Override
    public Label processText(String text) {
        for (String keyword : keywords) {
            if (text.toLowerCase().contains(keyword) && !keyword.isEmpty()) {
                return getLabel();
            }
        }
        return Label.OK;
    }

    @Override
    protected String[] getKeywords() {
        return this.keywords;
    }

    @Override
    protected Label getLabel() {

        return Label.SPAM;
    }


}
