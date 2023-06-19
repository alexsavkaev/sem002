package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Проверить, являются ли введённые строки, вращением друг друга.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String line1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        StringBuilder builder = new StringBuilder(in.nextLine()).reverse();
        String line2 = builder.toString();
        if(line1.equals(line2)) System.out.println("Да");
        else System.out.println("Нет");

        // 3+53=56
        // Средствами StringBuilder поменять "=" на "равно"
        StringBuilder builder1 = new StringBuilder("3+53=56");
        builder1.replace(builder1.indexOf("="),
                         builder1.indexOf("=")+1,
                         " равно ");
        System.out.println(builder1);
        String  line = "Научиться составлять программы";
        System.out.println(line.replace('а', 'б'));
        StringBuilder line3 = new StringBuilder(line);
//        for (int i = 0; i < line3.length(); i++) {
//            line3.replace(line3.indexOf("а"),
//                    line3.indexOf("а")+1,
//                    "б");
//        }
        System.out.println(line3);

    }
}