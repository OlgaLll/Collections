package ru.rzn.sbt.javaschool.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadLines {
    public static void ReadLines(String[] strArray) throws IOException {
        List<String> ls = new ArrayList<>();
        if (strArray != null) {
            ls.addAll(Arrays.asList(strArray));
        }
        System.out.println("Укажите количество номеров строк, которое будете вводить:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            int n = Integer.parseInt(reader.readLine());
            for (int i = 0; i < n; i++) {
                System.out.println("Укажите номер строки (номера строк начинаются с 1):");
                int j = Integer.parseInt(reader.readLine());
                if (j <= ls.size() & j > 0) {
                    System.out.println(ls.get(j - 1));
                } else {
                    System.out.println("Указан неверный номер строки");
                }
            }
        }
        catch (Exception e) {
            System.out.println("Вы ввели неверное значение!");
        }
    }
}
