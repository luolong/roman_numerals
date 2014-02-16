package dojo.roman.numerals;

public class RomanNumerals {
    public static String convertToRoman(int arabic) {
        return convertToRoman("", arabic);
    }

    private static String[] DIGITS = { "I", "V", "X", "L", "C", "D", "M" };

    public static final String M = DIGITS[6];
    public static final String D = DIGITS[5];
    public static final String C = DIGITS[4];
    public static final String L = DIGITS[3];
    public static final String X = DIGITS[2];
    public static final String V = DIGITS[1];
    public static final String I = DIGITS[0];

    private static String convertToRoman(String roman, int arabic) {
        if (arabic == 0) return roman;

        if (arabic >= 1000) return convertToRoman(roman + M, arabic - 1000);
        if (arabic >=  900) return convertToRoman(roman + C, arabic +  100);
        if (arabic >=  500) return convertToRoman(roman + D, arabic -  500);
        if (arabic >=  400) return convertToRoman(roman + C, arabic +  100);
        if (arabic >=  100) return convertToRoman(roman + C, arabic -  100);
        if (arabic >=   90) return convertToRoman(roman + X, arabic +   10);
        if (arabic >=   50) return convertToRoman(roman + L, arabic -   50);
        if (arabic >=   40) return convertToRoman(roman + X, arabic +   10);
        if (arabic >=   10) return convertToRoman(roman + X, arabic -   10);
        if (arabic >=    9) return convertToRoman(roman + I, arabic +    1);
        if (arabic >=    5) return convertToRoman(roman + V, arabic -    5);
        if (arabic >=    4) return convertToRoman(roman + I, arabic +    1);
        if (arabic >=    1) return convertToRoman(roman + I, arabic -    1);

        throw new IllegalArgumentException("\"" + roman + "\", "+ String.valueOf(arabic));
    }
}
