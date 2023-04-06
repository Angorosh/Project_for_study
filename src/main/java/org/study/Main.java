package org.study;

import java.util.Locale;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.DayOfWeek;

public class Main {

    public static void main(String[] args) {

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

    public static  void not_main_2(String[] args) {

        System.out.println("Тема 1: Данные от пользователя.");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String Name = scan.nextLine();
        System.out.println("Ваше имя - " + Name + ".");

        System.out.print("Введите Ваш возраст: ");
        int Age = scan.nextInt();
        System.out.println("Ваш возраст - " + Age + " лет.");

    }
    public static void not_main(String[] args) {
        System.out.println("Тема 1: Переменные и типы данных.");

        int Age = 77;
        System.out.println("Возраст: " + Age);

        float Num_1 = 4.5345f;
        System.out.println(Num_1);

        double Num_2 = 4.124124234234;
        System.out.println(Num_2);

    }
}
