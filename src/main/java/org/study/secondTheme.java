package org.study;

import java.util.Scanner;

public class secondTheme {
    public static void Data_From_User() {

        System.out.println("Тема 2: Данные от пользователя.");

        Scanner scan = new Scanner(System.in);

        System.out.print("Введите Ваше имя: ");
        String Name = scan.nextLine();
        System.out.println("Ваше имя - " + Name + ".");

        System.out.print("Введите Ваш возраст: ");
        int Age = scan.nextInt();
        System.out.println("Ваш возраст - " + Age + " лет.");

    }
}
