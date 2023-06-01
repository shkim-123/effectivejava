package com.example.effectivejava.ch02.item5;

import java.util.List;

public class SpellChecker2 {

    private static final Lexicon dictionary = null;

    private SpellChecker2() {}

    public static SpellChecker2 INSTANCE = new SpellChecker2();

    public static boolean isValid(String word) {
        return false;
    }
    public static List<String> suggestions(String typo) {
        return null;
    }
}
