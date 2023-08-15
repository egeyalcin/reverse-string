package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("ehT kciuq nworb xof spmuj revo eht yzal .god"));
    }

    public static String reverseWords(final String original) {
        if(original.trim().isEmpty()) {
            return original;
        }
        String[] array = original.split(" ");
        StringBuilder keepReverses = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            String str = array[i];
            StringBuilder strBuilder = new StringBuilder(str);
            keepReverses.append(strBuilder.reverse());
            if (i < array.length - 1) {
                keepReverses.append(" ");
            }
        }
        return keepReverses.toString();
    }
}