package com.tabrizu;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void FileFinder(String dir, String word, ArrayList<Finder> results) {
        File file = new File(dir);

        String[] components = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return (name.charAt(0) != '.' ? true : false);
            }

        });

        for (String subDir : components) {
            File temp = new File(dir + "/" + subDir);
            if (temp.isFile()) {
                Finder finder = new Finder(temp.getPath(), word);
                results.add(finder);

                finder.start();
            } else {
                FileFinder(dir + "/" + subDir, word, results);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        ArrayList<Finder> results = new ArrayList<Finder>();
        int counter = 0;
        
        System.out.println("Enter your start directory");
        String startDirectory = cin.next();
        
        System.out.println("===========================");
        
        System.out.println("Enter your word");
        String word = cin.next();
        
        cin.close();

        FileFinder(startDirectory, word, results);

        for (Finder thread : results) {
            if (thread.isAlive()) {
                try {
                    thread.join();
                } catch (InterruptedException e) {
                }
            }
            counter = thread.getResult() == true ? counter++ : counter;
        }

        System.out.println(counter);
    }
}
