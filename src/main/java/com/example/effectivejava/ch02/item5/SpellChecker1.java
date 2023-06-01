package com.example.effectivejava.ch02.item5;

import java.util.List;

public class SpellChecker1 {

    private static final Lexicon dictionary = null;

    private SpellChecker1() {} // 객체 생성 방지

    public static boolean isValid(String word) {
        return false;
    }
    public static List<String> suggestions(String typo) {
        return null;
    }
}
