package Exercise1611;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingLetters {
	private static Map<String, Integer> countLetters (String sentence) {
        Map<String, Integer> result = new HashMap<String, Integer>();

        for (char letter : sentence.toCharArray()) {
            boolean contain = result.containsKey(letter);
            if (contain) {
                int count = result.get(letter);
//                count++;
                result.put( Character.toString(letter), ++count);
            } else {
                result.put(Character.toString(letter), 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<String, Integer> counts;
        System.out.print("Enter sentence: ");
        String sentence = input.nextLine();

        counts = new HashMap<>(countLetters(sentence));

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.printf("letter: %s %ncount: %d%n%n", entry.getKey(), entry.getValue());
        }
    }

}
