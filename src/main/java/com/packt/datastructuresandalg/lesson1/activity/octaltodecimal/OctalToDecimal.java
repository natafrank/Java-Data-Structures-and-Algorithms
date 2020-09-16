package com.packt.datastructuresandalg.lesson1.activity.octaltodecimal;

public class OctalToDecimal {
    public int convertToDecimal(String octal) {
        int result = 0;
        int currentPow = 1;
        for(int i = octal.length() - 1; i >= 0; i--){
            result += getNumberFromStringAtPosition(octal, i) * currentPow;
            currentPow *= 8;
        }

        return result;
    }

    private int getNumberFromStringAtPosition(String string, int position){
        return Integer.parseInt(string.charAt(position) + "");
    }
}
