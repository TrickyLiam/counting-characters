package org.launchcode;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence to count recurring letters: ");
        String sentence = input.nextLine();
        char[] charactersInSentence = sentence.toLowerCase().toCharArray();

        HashMap<Character, Integer> charCounts = new HashMap<>();

        for (char c : charactersInSentence){

            if (charCounts.containsKey(c)) {
                charCounts.put(c, charCounts.get(c) + 1);
            } else {
                charCounts.put(c, 1);
            }
        }
//
//       for (char c : charCounts.keySet()) {
//           System.out.println(c + charCounts.keySet());
//       }

        for (Map.Entry<Character, Integer> keyValues : charCounts.entrySet()) {
            System.out.println(keyValues.getKey() + ":" + keyValues.getValue());

        }
    }


}
