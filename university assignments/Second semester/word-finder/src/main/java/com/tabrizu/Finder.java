package com.tabrizu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Finder extends Thread {
    private FileReader file;
    private BufferedReader bufferedReader = new BufferedReader(file);
    private String word;
    private boolean result;

    public Finder(String filename, String word) {
        try {
            this.file = new FileReader(filename);
            this.word = word;
        } catch (FileNotFoundException e) {
        }
    }

    @Override
    public void run() {
        String line;
        String[] words;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                words = line.split(" ");
                int counter = words.length;
                while (counter > -1) {
                    if (this.word == words[counter]) {
                        result = true;
                        return;
                    }
                    counter--;
                }
            }
        } catch (IOException e) {
        }
    }

    public boolean getResult() {
        return result;
    }
}
