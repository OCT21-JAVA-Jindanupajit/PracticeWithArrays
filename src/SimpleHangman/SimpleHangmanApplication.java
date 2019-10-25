package SimpleHangman;

import java.util.Random;
import java.util.Scanner;

public class SimpleHangmanApplication {
    public static void main(String[] args) {
        String[] wordList = {
                "tree", "rain", "bear", "encourage",
                "promise", "soup", "chess", "insurance",
                "pancake", "stream"
        };
        Scanner kb = new Scanner(System.in);
        char[] word = wordList[ (new Random()).nextInt(wordList.length) ].toCharArray();
        char[] input = new char[word.length*2];

        System.out.println(word);

        // Initialize input
        for (int i = 0; i < input.length; i++) {
            input[i] = ((i%2)==0)?'_':' ';
        }

        System.out.println("Welcome, let's play hangman\n");

        System.out.print("Here is the word I am thinking of: ");
        System.out.println(input);

        outer:
        for (int i = 0; (i < 5) ; i++) {
            boolean found = false;

            System.out.print("Enter your guess: ");

            char ch = kb.nextLine().charAt(0);

            int j;
            for (j = 0; j < word.length; j++) {
                if (ch == word[j]) {
                   found = true;
                   input [j*2] = ch;
                }
            }

            if (found) { --i; }

            System.out.print("Your guess so far: ");
            System.out.println(input);

            for (char c : input)  {
                if (c == '_') {
                    continue outer;
                }
            }


        }

    }


}
