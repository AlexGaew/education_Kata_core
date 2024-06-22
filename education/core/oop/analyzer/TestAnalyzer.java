package oop.analyzer;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestAnalyzer {

    public static void main(String[] args) {
        String[] keywords = {"Ревизор"};
        String text = " Когда в товарищах согласья нет,\n" +
                "На лад их дело не пойдет,\n" +
                "И выйдет из него не дело, только мука.\n" +
                "\n" +
                "Однажды Лебедь, Рак, да Щука\n" +
                "Везти с поклажей воз взялись,\n" +
                "И вместе трое все в него впряглись;\n" +
                "Из кожи лезут вон, а возу все нет ходу!\n" +
                "Поклажа бы для  них казалась и легка:\n" +
                "Да Лебедь рвётся в облака,\n" +
                "Рак пятится назад,  а Щука тянет в воду.\n" +
                "Кто виноват из них, кто прав,  — судить не нам;\n" +
                "Да только воз и ныне там.";
        NegativeTextAnalyzer negativeTextAnalyzer = new NegativeTextAnalyzer();
        SpamAnalyzer spamAnalyzer = new SpamAnalyzer(keywords);
        TooLongTextAnalyzer tooLongTextAnalyzer = new TooLongTextAnalyzer(20);
        TestAnalyzer testAnalyzer = new TestAnalyzer();
        TextAnalyzer[] analyzers = {negativeTextAnalyzer, spamAnalyzer, tooLongTextAnalyzer};
        System.out.println(testAnalyzer.checkLabels(analyzers, text));
        System.out.println("".length());
    }

    public Label checkLabels(TextAnalyzer[] analyzers, String text) {
        for (TextAnalyzer analyzer : analyzers) {
            if (analyzer instanceof SpamAnalyzer || analyzer instanceof NegativeTextAnalyzer || analyzer instanceof TooLongTextAnalyzer) {
                if (analyzer.processText(text) != Label.OK) {
                    return analyzer.processText(text);
                }
            }
        }
        return Label.OK;
    }
}
