package week3.day1;

public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String str1 = "We learn Java basics as part of java sessions in java week1";
		String[] words = str1.split("\\s+");
		int count = 0;
for (int i = 0; i < words.length; i++) {
    for (int j = i + 1; j < words.length; j++) {
        
        if (words[i].equals(words[j])) {
           
            words[j] = "";
            count++;
        }
    }
}
if (count > 0) {
    System.out.println("Modified words (duplicates removed):");
    for (String w : words) {
        if (!w.isEmpty()) {
            System.out.print(w + " ");
        }
    }
    System.out.println("\nTotal duplicates found: " + count);
} else {
    System.out.println("No duplicates found.");
}
}
}