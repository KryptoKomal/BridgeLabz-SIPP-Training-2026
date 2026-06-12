import java.util.*;

public class SpyAgency {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        return str.equalsIgnoreCase(reverseString(str));
    }

    public static void countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static boolean isAnagram(String s1, String s2) {
        char[] a = s1.toLowerCase().replaceAll("\\s", "").toCharArray();
        char[] b = s2.toLowerCase().replaceAll("\\s", "").toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static Character firstNonRepeating(String str) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter secret message: ");
        String message = sc.nextLine();

        System.out.println("Reversed Message: " + reverseString(message));

        if (isPalindrome(message))
            System.out.println("Palindrome: Yes");
        else
            System.out.println("Palindrome: No");

        countVowelsConsonants(message);

        System.out.print("Enter first intercept: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second intercept: ");
        String s2 = sc.nextLine();

        if (isAnagram(s1, s2))
            System.out.println("Anagram: Yes");
        else
            System.out.println("Anagram: No");

        Character result = firstNonRepeating(message);

        if (result != null)
            System.out.println("First Non-Repeating Character: " + result);
        else
            System.out.println("No Non-Repeating Character Found");

        sc.close();
    }
}