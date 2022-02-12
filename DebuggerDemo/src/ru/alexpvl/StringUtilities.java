package ru.alexpvl;

public class StringUtilities {
    private StringBuilder sBuilder = new StringBuilder();
    private int charsAdded = 0;

    public void addChar(StringBuilder sBuilder, char c) {
        sBuilder.append(c);
        charsAdded++;
    }

    public String upperAndPrefix(String str) {
        String res = str.toUpperCase();
        return "Prefix_" + res;
    }

    public String addSuffix(String str) {
        return str + "__Suffix";
    }
}
