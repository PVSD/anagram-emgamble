package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner word1Reader = new Scanner(System.in);
        System.out.println("Enter your first word here: ");
        String word1 = word1Reader.nextLine();

        Scanner word2Reader = new Scanner(System.in);
        System.out.println("Enter your second word here: ");
        String word2 = word2Reader.nextLine();

        int count = 0;
        int doub = 0;
        int doubfix = 0;

        if (word1.length() == word2.length()) {
            char[] worda = word1.toCharArray();
            char[] wordb = word2.toCharArray();

            for (int j = 0; j < word1.length(); j++) {
                for (int k = 0; k < word1.length(); k++)
                    if (worda[j] == wordb[k])
                        count++;
            }

            for (int m = 0; m < word1.length(); m++) {
                for (int n = 0; n < word1.length(); n++)
                    if (worda[n] == worda[m])
                        doub++;

            }


            //System.out.println(doub);

            doubfix = doub - word1.length();
            count = count - doubfix;
           // System.out.println(doubfix);
            //System.out.println(count);

            if (count >= word1.length())
                System.out.println(word1 + " and " + word2 + " are anagrams.");
            else
                System.out.println(word1 + " and " + word2 + " are not anagrams.");



        }
        else
            System.out.println(word1 + " and " + word2 + " are not anagrams.");












    }
}
