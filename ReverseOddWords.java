package week3.day1;

public class ReverseOddWords {
	public static String reverseOddWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i % 2 == 1) {  
                word = new StringBuilder(word).reverse().toString();
            }
            result.append(word);
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "I am a software tester";
        String output = reverseOddWords(sentence);
        System.out.println(output);
        
    }

}
