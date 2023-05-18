import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String first_string = "KEEP";
        String second_string = "PEEK";
        first_string = first_string.toLowerCase();
        second_string = second_string.toLowerCase();
        char str1[] = first_string.toCharArray();
        char str2[] = second_string.toCharArray();
        boolean isSame = false;
        Arrays.sort(str1);
        Arrays.sort(str2);
        if (Arrays.equals(str1, str2)) {
            System.out.println("Anagram");
        } else {
            System.out.println("not Anagram");
        }
    }
}
