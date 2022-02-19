package fr.achillebourgault.achtml.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TermConsole {

    public static void print(TermLevel termLevel, String message) {
        String timestamp = new SimpleDateFormat("HH:mm:ss", Locale.FRANCE).format(new Date());

        if (termLevel == TermLevel.ERROR) {
            System.out.println(TermColor.ANSI_PURPLE + "[" + timestamp + "] " + TermColor.ANSI_RED + message + TermColor.ANSI_RESET + "\n");
            return;
        }
        System.out.println(TermColor.ANSI_PURPLE + "[" + timestamp + "] " + TermColor.ANSI_RESET + message);
    }

}
