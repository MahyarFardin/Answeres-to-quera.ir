package com.tabrizu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finder extends Thread {
    private Scanner file;
    private String word;
    private boolean result;

    public Finder(String fileName, String word) {
        File file=new File(fileName);
        try {
            this.file = new Scanner(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.word = word;
    }

    @Override
    public void run() {
        while (file.hasNextLine()) {
            String[] words = file.nextLine().split(" ");
            for (String string : words) {
                if (string.equals(word)) {
                    this.result = true;
                    return;
                }
            }
        }
    }

    public boolean getResult() {
        return result;
    }
}
