package com.test;

import java.io.*;
import java.util.ArrayList;

public class SortingAndSavingTextFile {

    public static void main(String[] args) throws IOException {
        //ПОКА НЕ СОХРАНЯЕТ В UNICODE
        String inputFile = "C:\\1\\1.txt";
        String outputFile = "C:\\1\\1-sorted.txt";
        FileReader fileReader = new FileReader(inputFile);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        ArrayList<String> list = new ArrayList<>();
        while (bufferedReader.ready())
            list.add(bufferedReader.readLine());

        bufferedReader.close();

        list.sort(String::compareTo); // сортировка с помощью лямбды
//        list.forEach(System.out::println); // вывод на консоль с помощью лямбды


        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < list.size(); i++) {
            bufferedWriter.write(list.get(i).trim());
            bufferedWriter.newLine();
        }bufferedWriter.close();

        System.out.println("Completed");

    }
}
