package com.example.effectivejava.ch02.item5;

import java.util.List;
import java.util.Objects;

public class SpellChecker3 {

    private final Lexicon dictionary;

    public SpellChecker3(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }

    public static boolean isValid(String word) {
        return false;
    }
    public static List<String> suggestions(String typo) {
        return null;
    }
}
