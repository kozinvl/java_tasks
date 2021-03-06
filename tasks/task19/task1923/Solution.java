package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));
        BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]));
        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.split(" ");
            for (String word : words) {
                if (!word.matches("^\\D*$"))
                    writer.write(word + " ");
            }
        }
            writer.close();
            reader.close();

        }



    }

