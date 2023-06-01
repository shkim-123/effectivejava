package com.example.effectivejava.ch02.item6;

import java.util.regex.Pattern;

public class RomanNumberals {

    private static final Pattern ROMAN = Pattern.compile(
            "^(?=.)M*(C[MD]|D?C{0,3})"
                    + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeral(String s) {
        return ROMAN.matcher(s).matches();
    }

    // matches는 성능이 중요한 상황에서 반복 사용 하기에 적합 x
//    static boolean isRomanNumeral(String s) {
//        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
//                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
//    }

    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }
}

