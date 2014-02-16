package dojo.roman.numerals

import spock.lang.Specification
import spock.lang.Unroll

class RomanNumeralsTest extends Specification {

    @Unroll
    def "Roman numeral for #arabic is \"#roman\""() {
        expect:
        roman == RomanNumerals.convertToRoman(arabic)

        where:
        arabic | roman
             1 | "I"
             5 | "V"
            10 | "X"
            50 | "L"
           100 | "C"
           500 | "D"
          1000 | "M"
          2000 | "MM"
           200 | "CC"
            20 | "XX"
             2 | "II"
           600 | "DC"
            60 | "LX"
             6 | "VI"
           900 | "CM"
            90 | "XC"
             9 | "IX"
           400 | "CD"
            40 | "XL"
             4 | "IV"
            49 | "XLIX"
           999 | "CMXCIX"
          1994 | "MCMXCIV"
          1954 | "MCMLIV"
          1990 | "MCMXC"
    }
}
