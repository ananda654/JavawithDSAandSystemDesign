public class Panagram_Program {
    public static void main(String[] args) {
        boolean isPanagram = true;
        String sc = "The quick brown fox jumps over the lazy dog";
        sc = sc.replace(" ", "");
        sc = sc.toLowerCase();
        char arr[] = sc.toCharArray();
        int array[] = new int[26];
        for (int i = 0; i < arr.length; i++) {
            array[arr[i] - 97]++;
            // System.out.println(arr[i]-97);
        }
        // System.out.println(array);
        for (int a : array) {
            if (a < 0) {
                isPanagram = false;
            }
        }
        if (isPanagram = true) {
            System.out.println("It is a Panagram");

        } else {
            System.out.println("It is a not Panagram");
        }
    }
}
