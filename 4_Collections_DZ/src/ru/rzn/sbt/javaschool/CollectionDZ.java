package ru.rzn.sbt.javaschool;

import ru.rzn.sbt.javaschool.sort.SortWords;
import ru.rzn.sbt.javaschool.util.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class CollectionDZ {
    static String[] strArray = {"мама мыла раму",
        "на дворе трава",
        "на траве дрова",
        "не руби дрова"};

    public static void main (String[] args) throws IOException {
        System.out.println("Исходный файл:");
        System.out.println(Arrays.deepToString(strArray)+"\n");

        //Задание 1: Подсчитайте количество различных слов в файле.
        System.out.println("Количество различных слов в тексте: " + CountDifWords.countDifWords(strArray)+"\n");

        //Задание 2: Выведите на экран список различных слов файла, отсортированный по возрастанию их длины
        //(компаратор сначала по длине слова, потом по тексту).
        System.out.println("Список различных слов в файле:");
        System.out.println(SortWords.sortWords(strArray).toString()+"\n");

        //Задание 3: Подсчитайте и выведите на экран сколько раз каждое слово встречается в файле.
        System.out.println("Cколько раз каждое слово встречается в файле:");
        System.out.println(CountOfWord.CountOfWord(strArray).toString()+"\n");

        //Задание 4: Выведите на экран все строки файла в обратном порядке.
        System.out.println("Строки в обратном порядке:");
        System.out.println(ReversLines.ReverseLines(strArray).toString()+"\n");

        //Задание 5: Реализуйте свой Iterator для обхода списка в обратном порядке.
        ArrayList<String> ls;
        if (strArray != null) {
             ls = new ArrayList<>(Arrays.asList(strArray));
        }
        else {ls = null;}
        IteratorReverse ir = new IteratorReverse(ls);
        System.out.println("Cвой Iterator для обхода списка в обратном порядке:");
        while(ir.hasNext()) {
            System.out.println(ir.next());
        }
        System.out.println(" ");

        //Задание 6: Выведите на экран строки, номера которых задаются пользователем в произвольном порядке.
        ReadLines.ReadLines(strArray);
    }
}