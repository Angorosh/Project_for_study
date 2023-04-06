package org.study;

import java.util.Locale;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.DayOfWeek;

public class thirdTheme {

    public static void Conditional_Constructs() {

        System.out.println("Тема 3: Условные конструкции.");

        boolean isMonday = false;

        LocalDate date = LocalDate.now();
        Locale langRU = new Locale("ru");
        DayOfWeek day = date.getDayOfWeek();
        String str = day.getDisplayName(TextStyle.FULL, langRU);

            System.out.println(str);

            if (str == "понедельник") {
                isMonday = true;
            }

            if (isMonday) {
                System.out.println("Сегодня понедельник. :(");
            } else {
                System.out.println("Сегодня не понедельник! :)");
        }
    }
}

