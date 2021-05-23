package by.gsu.pms;

import java.util.Scanner;

public static boolean isVowel(char c) {
    switch (Character.toLowerCase(c)) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'y':
            return true;
        default:
            return false;
    }
}
}