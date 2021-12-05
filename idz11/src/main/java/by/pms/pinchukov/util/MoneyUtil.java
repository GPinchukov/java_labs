package by.akarumey.project.util;

public class MoneyUtil {

    public static String formatMoney(final int val) {
        return val / 100 + "." + (val / 10 % 10) + val % 10;
    }
}
