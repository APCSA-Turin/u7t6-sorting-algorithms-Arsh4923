package com.example.project.Selection_Sort;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;

public class SelectionSort {

    // PART A: Implementing Selection Sort for an integer array
    public static int[] selectionSort(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = elements[i];
                elements[i] = elements[minIndex];
                elements[minIndex] = temp;
            }
        }
        return elements;
    }

    // PART B: Sorting a 1000-word list using Selection Sort
    public static ArrayList<String> selectionSortWordList(ArrayList<String> words) {
        for (int i = 0; i < words.size() - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < words.size(); j++) {
                if (words.get(j).compareTo(words.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                String temp = words.get(i);
                words.set(i, words.get(minIndex));
                words.set(minIndex, temp);
            }
        }
        return words;
    }

    // Call this method to load 1000 words into the list. Use it to test Part B.
    public static ArrayList<String> loadWordsInto(ArrayList<String> wordList) {
        Scanner input = null;
        try {
            input = new Scanner(new File("src/main/java/com/example/project/Selection_Sort/words.txt"));
            while (input.hasNext()) {
                String word = input.next();
                wordList.add(word);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        } finally {
            if (input != null) {
                input.close();
            }
        }
        return wordList;
    }
}
